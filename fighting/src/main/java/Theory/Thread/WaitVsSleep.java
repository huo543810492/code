package Theory.Thread;

public class WaitVsSleep {
    static Object Lock = new Object();
    public static void main(String[] args) throws InterruptedException {
//        illegalWait();
        sleeping();
//        waiting();
    }

    private static void sleeping() throws InterruptedException {
        Thread t1 = new Thread(()->{
         synchronized(Lock){
             try {
                 System.out.println("Sleeping...");
                 Thread.sleep(5000L);//这个就要等他醒来，做完，释放锁后，other才会打出来
             } catch (InterruptedException e) {
                 System.out.println("interrupted...");
                 e.printStackTrace();
             }
         }
        },"t1");
        t1.start();

        Thread.sleep(100);
        synchronized (Lock){
            System.out.println("other");
        }
    }
    private static void waiting() throws InterruptedException {
        Thread t1 = new Thread(()->{
            synchronized(Lock){
                try {
                    System.out.println("Waiting...");
                    Lock.wait(5000L);//wait 时候同时会放弃锁
                } catch (InterruptedException e) {
                    System.out.println("interrupted...");
                    e.printStackTrace();
                }
            }
        },"t1");
        t1.start();

        Thread.sleep(100);
        synchronized(Lock){
            System.out.println("other...");
        }
    }

    private static void illegalWait() throws InterruptedException {
//        Lock.wait(); 会报错，说明没有获得锁，不能wait
        synchronized(Lock){
            Lock.wait();
        }
    }
}
