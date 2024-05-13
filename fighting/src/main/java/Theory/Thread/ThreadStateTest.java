package Theory.Thread;

import java.util.concurrent.locks.Lock;
import java.util.logging.Logger;

public class ThreadStateTest {
    static Object Lock = new Object();

    public static void main(String[] args) {
//        testNewRunnableTerminated();
//        testBlocked();
          testWaiting();
    }

    private static void testWaiting() {
        Thread t2 = new Thread(() -> {
            synchronized (Lock) {
                System.out.println("before waiting"); //1
                try {
                    Lock.wait();//3
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "t2");

        t2.start();
        System.out.println("state: " + t2.getState());//2
        synchronized (Lock) {
            System.out.println("state: " + t2.getState());//4
            Lock.notify();//5
            System.out.println("state: " + t2.getState());//6

        }
        System.out.println("state: " + t2.getState());//7

    }
    private static void testBlocked() {
        Thread t2 = new Thread(() -> {
            System.out.println("before sync");//3
            synchronized (Lock){
                System.out.println("in sync");//6
            }
        },"t2");

        t2.start();
        System.out.println("state: " + t2.getState());//1
        synchronized(Lock){//2
            System.out.println("state: " + t2.getState());//4
        }//5
        System.out.println("state: " + t2.getState());//7

    }

    private static void testNewRunnableTerminated() {
        Thread t1 = new Thread(() ->{
            System.out.println("running");
        },"t1");

        System.out.println("state" + t1.getState());
        t1.start();
        System.out.println("state" + t1.getState());
        //先去释放t1，这样就可以看到terminated
        System.out.println("state" + t1.getState());




    }
}
