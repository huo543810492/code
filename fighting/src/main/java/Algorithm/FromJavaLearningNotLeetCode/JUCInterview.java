package Algorithm.FromJavaLearningNotLeetCode;

import java.util.concurrent.locks.LockSupport;

public class JUCInterview {
    private int loopNumber;
    public JUCInterview(int loopNumber){
        this.loopNumber = loopNumber;
    }

    public void print(String s, Thread next)
    {
        for (int i = 0; i <loopNumber; i++) {
            LockSupport.park();
            System.out.print(s);
            LockSupport.unpark(next);
        }
    }

    static Thread t1;
    static Thread t2;
    static Thread t3;
    public static void main(String[] args) {
        JUCInterview jucInterview = new JUCInterview(5);

        t1 = new Thread(()->{
            jucInterview.print("a",t2);
        });

        t2 = new Thread(()->{
            jucInterview.print("b",t3);
        });

        t3 = new Thread(()->{
            jucInterview.print("c",t1);
        });

        t1.start();
        t2.start();
        t3.start();
        LockSupport.unpark(t1);
    }
}
