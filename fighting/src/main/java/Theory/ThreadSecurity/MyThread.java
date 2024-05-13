package Theory.ThreadSecurity;
//通过synchronized代码块解决线程安全问题
public class MyThread implements Runnable {

    private int ticket = 100;
    Object obj = new Object();
    @Override
    public void run() {
        while (true){
            synchronized (obj){
                if (ticket>0){
                    try {
                        Thread.sleep(100);//为了提高出现线程不安全的概率，模拟大的系统功能多，耗时长
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"正在卖" +ticket);
                    ticket--;
                }
                else break;
            }
        }
    }
}
