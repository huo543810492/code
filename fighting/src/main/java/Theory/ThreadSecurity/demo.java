package Theory.ThreadSecurity;

public class demo {
    //这个是线程安全的练习，通过synchronized代码块解决线程安全问题
    public static void main(String[] args) {
//        Runnable run = new MyThread();
//        Thread t0 = new Thread(run);
//        Thread t1 = new Thread(run);
//        Thread t2 = new Thread(run);
//        t0.start();
//        t2.start();
//        t1.start();



        //synchronized 方法
        Runnable run2 = new MyThreadsynchronizedMethod();
        Thread t3 = new Thread(run2);
        Thread t4 = new Thread(run2);
        Thread t5 = new Thread(run2);
        t3.start();
        t4.start();
        t5.start();

//        //Lock方法
//        Runnable r = new LockPractice();
//        new Thread(r).start();
//        new Thread(r).start();
//        new Thread(r).start();
    }



}
