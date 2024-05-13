package Theory.ThreadSecurity;
//等待唤醒案例
public class waitPractice {
    public static void main(String[] args) {
        Object o = new Object();
        new Thread(){
            @Override
            public void run() {
                synchronized (o){
                    System.out.println("我要买包子");
                    try {
                        o.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("包子做好了开始吃");
                }

            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (o){
                    o.notify();
                    System.out.println("包子做好了");
                }
            }
        }.start();
    }
}
