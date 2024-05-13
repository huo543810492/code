package Theory.JUCInterview;

import java.util.concurrent.locks.LockSupport;

public class JUC {
    private int loopNumber;
    public JUC(int loopNumber){
        this.loopNumber=loopNumber;
    }
    public void print(String s, Thread next){
        for(int i=0;i<loopNumber;i++)
        {
            LockSupport.park();
            System.out.print(s);
            LockSupport.unpark(next);
        }
    }
    static Thread t1,t2,t3;
    public static void main(String[] args) {
        JUC juc = new JUC(5);
        t1=new Thread(()->juc.print("a",t2));
        t2=new Thread(()->juc.print("b",t3));
        t3=new Thread(()->juc.print("c",t1));
        t1.start();
        t2.start();
        t3.start();
        LockSupport.unpark(t1);

    }
}
