package Theory.ThreadSecurity;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockPractice implements Runnable{
    private int ticket =100;
    Lock l = new ReentrantLock();
    @Override
    public void run() {
        while (true){
            buyTicket();
        }
    }

    private  void buyTicket() {
        l.lock();
        if (ticket>0){
            try {
                Thread.currentThread().sleep(300);
                System.out.println(Thread.currentThread().getName() + "在卖票" + ticket);
                ticket--;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            finally {//一个代码的优化
                l.unlock();
            }
        }
    }
}