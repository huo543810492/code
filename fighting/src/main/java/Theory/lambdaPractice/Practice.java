package Theory.lambdaPractice;

public class Practice {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "来了");
            }
        }).start();

        new Thread(() ->{
                System.out.println(Thread.currentThread().getName() + "来了");
            }
        ).start();
    }
}
