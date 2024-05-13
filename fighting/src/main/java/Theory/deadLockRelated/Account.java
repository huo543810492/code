package Theory.deadLockRelated;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 展示一个转账过程中一个常见的死锁问题以及逐步的解决方法
 */
public class Account implements Comparable<Account> {
    int id;
    int balance;
    final Lock lock = new ReentrantLock();

    public Account(int id, int balance) {
        this.id = id;
        this.balance = balance;
    }

    @Override
    public int compareTo(Account other) {
        return Integer.compare(this.id,other.id);
    }

    //有并发问题
//        public static void transfer(Account from, Account to, Integer amount){
//            System.out.println(Thread.currentThread().getName() +"获得类锁，"+"from账户余额为 "+from.balance+"， to账户余额为 "+to.balance);
//            if(from.balance < amount){
//                throw new RuntimeException("no enough money");
//            }
//            from.balance -= amount;
//            to.balance += amount;
//        }

    // 对象锁，还是有并发问题
//    public synchronized void transfer(Account to, Integer amount) {
//        System.out.println(Thread.currentThread().getName() + "获得类锁，" + "from账户余额为 " + this.balance + "， to账户余额为 " + to.balance);
//        if (this.balance < amount) {
//            throw new RuntimeException("no enough money");
//        }
//        this.balance -= amount;
//        to.balance += amount;
//    }

    // 类锁，没并发问题
//    public static synchronized void transfer(Account to, Integer amount) {
//        System.out.println(Thread.currentThread().getName() + "获得类锁，" + "from账户余额为 " + this.balance + "， to账户余额为 " + to.balance);
//        if (this.balance < amount) {
//            throw new RuntimeException("no enough money");
//        }
//        this.balance -= amount;
//        to.balance += amount;
//    }


    // deal lock
//    public void transfer(Account to, Integer amount){
//        synchronized (this){
//            System.out.println(Thread.currentThread().getName() + "获得from的锁在等to的锁");
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            synchronized (to){
//                System.out.println(Thread.currentThread().getName() + "获得to的锁开始转账");
//                if(this.balance < amount){
//                    throw new RuntimeException("no enough money");
//                }
//                this.balance -= amount;
//                to.balance += amount;
//            }
//        }
//    }

    // ReentrantLock
//    public void transfer(Account to, Integer amount) {
//        if(this.lock.tryLock()){
//            try {
////                Thread.sleep(100);
//                if(to.lock.tryLock()){
//                    try {
//                        System.out.println("获得ReentrantLock开始转账");
//                        if(this.balance < amount){
//                            throw new RuntimeException("no enough money");
//                        }
//                        this.balance -= amount;
//                        to.balance += amount;
//                    }finally {
//                        to.lock.unlock();
//                    }
//                }
////            } catch (InterruptedException e) {
////                throw new RuntimeException(e);
//            } finally {
//                this.lock.unlock();
//            }
//        }
//    }

    // ReentrantLock加超时时间，从而增加转账成功几率
//    boolean safeTransfer(Account to, int amount, long timeout)  {
//        boolean fromLockAcquired = false;
//        boolean toLockAcquired = false;
//        try {
//            // 尝试获取第一个锁
//            fromLockAcquired = this.lock.tryLock(timeout, TimeUnit.MILLISECONDS);
//            if (!fromLockAcquired) {
//                return false; // 未能获取第一个锁，直接返回
//            }
//
//            // 尝试获取第二个锁
//            toLockAcquired = to.lock.tryLock(timeout, TimeUnit.MILLISECONDS);
//            if (!toLockAcquired) {
//                return false; // 未能获取第二个锁，直接返回
//            }
//
//            // 执行转账操作
//            if (this.balance < amount) {
//                throw new RuntimeException("no enough money");
//            }
//            this.balance -= amount;
//            to.balance += amount;
//            System.out.println("获得ReentrantLock开始转账");
//            return true; // 转账成功
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        } finally {
//            if (fromLockAcquired) {
//                this.lock.unlock();
//            }
//            if (toLockAcquired) {
//                to.lock.unlock();
//            }
//        }
//    }
    // 升序ID+ReentrantLock
//    public void transfer(Account to, int amount){
//        // 按照id升序的顺序获得锁
//        Account first=this.compareTo(to)>0?to:this;
//        Account second=this.compareTo(to)>0?this:to;
//        boolean firstLockAcquired = false;
//        boolean secondLockAcquired = false;
//        System.out.println("线程 "+Thread.currentThread().getName()+" 的first是"+first.id);
//        try{
//            firstLockAcquired = first.lock.tryLock(100L,TimeUnit.MILLISECONDS);
//            Thread.sleep(100);
//            secondLockAcquired = second.lock.tryLock(100L,TimeUnit.MILLISECONDS);
//            if (firstLockAcquired && secondLockAcquired) {
//                // 执行转账操作
//                if (this.balance < amount) {
//                    throw new RuntimeException("no enough money");
//                }
//                this.balance -= amount;
//                to.balance += amount;
//                System.out.println("获得ReentrantLock开始转账");
//            }
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        } finally {
//            if(firstLockAcquired){
//                first.lock.unlock();
//            }
//            if(secondLockAcquired){
//                second.lock.unlock();
//            }
//        }
//    }

    //升序id加synchronized
//    public void transfer(Account to, int amount){
//        // 按照id升序的顺序获得锁
//        Account first=this.compareTo(to)>0?to:this;
//        Account second=this.compareTo(to)>0?this:to;
//        System.out.println("线程 "+Thread.currentThread().getName()+" 的first是"+first.id);
//        try{
//            synchronized (first){
//                Thread.sleep(100);
//                synchronized (second){
//                    // 执行转账操作
//                    if (this.balance < amount) {
//                        throw new RuntimeException("no enough money");
//                    }
//                    this.balance -= amount;
//                    to.balance += amount;
//                    System.out.println("没有死锁，开始转账");
//                }
//            }
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//    }

    // ReentrantLock加超时时间加不断重试，保证结果确定
    public void transfer(Account to, int amount)  {
        boolean fromLockAcquired = false;
        boolean toLockAcquired = false;
        while (true){
            try {
                // 尝试获取第一个锁
                fromLockAcquired = this.lock.tryLock(100L, TimeUnit.MILLISECONDS);
                if (fromLockAcquired) {
                    // 尝试获取第二个锁
                    toLockAcquired = to.lock.tryLock(100L, TimeUnit.MILLISECONDS);
                    if (toLockAcquired) {
                        // 执行转账操作
                        if (this.balance < amount) {
                            throw new RuntimeException("no enough money");
                        }
                        this.balance -= amount;
                        to.balance += amount;
                        System.out.println("获得ReentrantLock开始转账");
                        break;
                    }
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                if (fromLockAcquired) {
                    this.lock.unlock();
                }
                if (toLockAcquired) {
                    to.lock.unlock();
                }
            }
            // 短暂休眠防止活锁
            Thread.yield();
        }
    }
}
class BankService{
    public static void main(String[] args) throws Exception {
        Account a = new Account(1,10000);
        Account b = new Account(2,10000);
        Thread t1 = new Thread(()->{
            for (int i=0;i<1000; i++){
                a.transfer(b,1);
                System.out.println("a去转转给b，" + "from账户余额为 " + a.balance + "， to账户余额为 " + b.balance);
            }
        }, "t1");

        Thread t2 = new Thread(()->{
            for (int i=0;i<1000; i++){
                b.transfer(a,1);
                System.out.println("b去转转给a，" + "from账户余额为 " + b.balance + "， to账户余额为 " + a.balance);
            }
        }, "t2");
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("a left "+a.balance+" b left "+b.balance);
    }
}
