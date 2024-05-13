package Theory.VolatileTest;

public class Volatile1 {

        static boolean flag = true;

        public static void main(String[] args) throws InterruptedException {

            for (int i = 0; i <10 ; i++) {
                new Thread(()->{
                    while (flag){

                    }
                }).start();

            }
            Thread.sleep(5000);
            flag = false;
            System.out.println("flag改了");
        }
    }


