package Theory.virtualThread;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 	当一个平台线程进入 synchronized 块时，该线程会被阻塞，直到它完成并释放锁。
 * 	如果这个平台线程正在执行一个虚拟线程的任务，那么这个虚拟线程的阻塞也会导致平台线程的阻塞。
 * 这意味着，如果大量虚拟线程进入 synchronized 块，实际上会占用大量平台线程，导致资源浪费和性能下降。
 */
public class TestWithLock {

    public static void main(String[] args) {
        ResourceAccessSyn resourceAccessSyn = new ResourceAccessSyn();
        ResourceAccessReen resourceAccessReen = new ResourceAccessReen();

        // 使用虚拟线程访问资源，进行synchronized方法测试
        long startSyn = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            Thread.ofVirtual().start(() -> {
                resourceAccessSyn.accessResource();
            });
        }//synchronized耗时: 25282500 ns
        long endSyn = System.nanoTime();
        System.out.println("synchronized耗时: " + (endSyn - startSyn) + " ns");

        // 使用虚拟线程访问资源，进行ReentrantLock方法测试
        long startReen = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            Thread.ofVirtual().start(() -> {
                resourceAccessReen.accessResource();
            });
        }//ReentrantLock耗时: 6670375 ns
        long endReen = System.nanoTime();
        System.out.println("ReentrantLock耗时: " + (endReen - startReen) + " ns");
    }

    public static class ResourceAccessSyn {
        private final Object lock = new Object();

        public String accessResource() {
            synchronized (lock) {
                // 执行需要同步的代码
                return access();
            }
        }

        private String access() {
            // 模拟资源访问
            return "Resource accessed";
        }
    }


    public static class ResourceAccessReen {
        private static final ReentrantLock LOCK = new ReentrantLock();

        public String accessResource() {
            LOCK.lock();
            try {
                // 执行需要同步的代码
                return access();
            } finally {
                LOCK.unlock();
            }
        }

        private String access() {
            // 模拟资源访问
            return "Resource accessed";
        }
    }
}
