package Theory.Thread;

public class ThreadImpl implements Runnable{
    @Override
    public void run() {
        System.out.println("implements Runnable");
    }

    public static void main(String[] args) {
        Thread t1=new Thread(new ThreadImpl());
        t1.start();
    }
}
