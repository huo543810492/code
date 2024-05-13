package Theory.ThreadSecurity;

public class MyThreadsynchronizedMethod implements Runnable{
    private int ticket =100;

    @Override
    public void run() {
        while (true){
            Object o = new Object();
            synchronized(o){
                buyTicket();
            }
        }
    }

    private synchronized void buyTicket() {
        if (ticket>0){
            try {
                Thread.currentThread().sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "在卖票" + ticket);
            ticket--;
        }
    }
}
