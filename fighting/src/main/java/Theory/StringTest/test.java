package Theory.StringTest;

import java.nio.ByteBuffer;

public class test {
    static boolean flag = true;

    public static void main(String[] args) throws InterruptedException {
//        String s1 = "a";
//        String s2 = "b";
//        String s3 = "ab";
//        String s4 = s1 + s2;
//        System.out.println(("a"+"b") == s3);
//        System.out.println(s4 == s3);
//        System.out.println(s4.intern() == s3);
//        System.out.println(("a" + "b") == new String("ab").intern());
//        System.out.println(new String("a") == "a");

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
