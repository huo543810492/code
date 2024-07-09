package Theory.BigDecimal;

import java.math.BigDecimal;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * 背景
 * 因为金融系统自然少不了对资金的计算，多线程下计算也很常见
 * 由于Bigdecimal是不可变的对象，如果多线程计算中大量创建Bigdecimal的话
 * 可能会造成内存溢出，使用ThreadLocal在Bigdecimal计算后释放资源
 */
public class MutiThreadUsingThreadLocal {
    private static final int NUM_THREADS = 10;
    private static final int NUM_OPERATIONS = 100000;

    public static void main(String[] args) throws InterruptedException {
        // ThreadLocal to hold BigDecimal instances for each thread
        ThreadLocal<BigDecimal> threadLocalA = new ThreadLocal<>();
        ThreadLocal<BigDecimal> threadLocalB = new ThreadLocal<>();
        threadLocalA.set(new BigDecimal("1234.45"));
        threadLocalB.set(new BigDecimal("3222.45"));

        ExecutorService executor = Executors.newFixedThreadPool(NUM_THREADS);

        Runnable task = () -> {
            try{
                BigDecimal sum = BigDecimal.ZERO;
                BigDecimal a = threadLocalA.get();
                BigDecimal b = threadLocalB.get();
                for (int i = 0; i < NUM_OPERATIONS; i++) {
                    sum = sum.add(a.multiply(b));
                }
                System.out.println("Final sum: " + sum);
            }finally {
                threadLocalA.remove();
                threadLocalB.remove();

                // Check if the ThreadLocal values are removed
                if (threadLocalA.get() == null && threadLocalB.get() == null) {
                    System.out.println("ThreadLocal values have been successfully removed.");
                } else {
                    System.out.println("ThreadLocal values have not been removed.");
                }
            }
        };
        long startTime = System.nanoTime();

        for (int i = 0; i < NUM_THREADS; i++) {
            executor.submit(task);
        }

        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.HOURS);

        long endTime = System.nanoTime();
        long duration = TimeUnit.NANOSECONDS.toMillis(endTime - startTime);
        System.out.println("Total time: " + duration + " ms");
    }
}
