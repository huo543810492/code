package Theory.virtualThread;


import java.util.concurrent.atomic.LongAdder;
import java.util.concurrent.locks.LockSupport;
import java.util.function.Supplier;

/**
 * 尝试通过创建能支持的最大线程数，来测试普通线程和虚拟线程性能区别
 * 在 PerformanceTest 类中，LockSupport.park(); 的作用是将当前线程阻塞（挂起），以防止它终止。这对于创建大量线程的测试非常重要，原因如下：
 * 当一个线程执行完其 run() 方法后，它会自动终止。为了保持线程的存活，我们需要让线程在某个地方阻塞，而不是让它继续运行直到终止。
 * LockSupport.park() 将当前线程阻塞，直到它被明确地唤醒（如通过 LockSupport.unpark(Thread)），或者线程被中断。
 * 保持线程的存活：
 *
 * 在测试普通线程和虚拟线程的性能时，我们希望能够创建尽可能多的线程。这需要让所有已创建的线程都保持存活状态，而不是创建后立即终止。
 * 使用 LockSupport.park() 可以确保每个线程在创建后都进入阻塞状态，从而保持线程存活，便于统计和观察。
 */
public class PerformanceTest {
    public static void tryCreateInfiniteThreads(){
        LongAdder adder = new LongAdder();
        Runnable job = () -> {
            adder.increment();
            System.out.println("Thread count = " + adder.longValue());
            LockSupport.park();// 阻塞线程，防止线程终止
        };

        // 启动普通线程,只能启动Thread count = 4067
//        startThreads(() -> new Thread(job));

        // 启动虚拟线程,很强Thread count = 2838197
        startThreads(() -> Thread.ofVirtual().unstarted(job));
    }

    public static void startThreads(Supplier<Thread> threadSupplier){
    // Supplier的使用方式很巧妙
        while (true){
            Thread thread = threadSupplier.get();
            thread.start();
        }
    }

    public static void main(String[] args) {
        tryCreateInfiniteThreads();
    }
}
