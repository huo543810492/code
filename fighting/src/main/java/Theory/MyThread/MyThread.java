package Theory.MyThread;

public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <200 ; i++) {
            System.out.println("run:" + i );
        }
    }
}
