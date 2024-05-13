package Theory.MyThread;

public class mainDemo
{
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();//多线程
        for (int i = 0; i <200 ; i++) {
            System.out.println("main" + i);
        }
    }
}
