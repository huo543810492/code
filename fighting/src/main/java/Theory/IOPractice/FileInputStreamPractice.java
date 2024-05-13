package Theory.IOPractice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileInputStreamPractice {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\编程\\tmall_Springboot\\final project\\Demo\\src\\IOPractice\\a.txt");
//        System.out.println( (char) fis.read());
//        System.out.println( (char) fis.read());
//        System.out.println( (char) fis.read());
//        System.out.println( (char) fis.read());
//        System.out.println( (char) fis.read());
//        System.out.println( (char) fis.read());
//        System.out.println( (char) fis.read());
//        System.out.println( (char) fis.read());
//        System.out.println( (char) fis.read());
//        System.out.println( (char) fis.read());
//        System.out.println( (char) fis.read());
//        System.out.println( (char) fis.read());
//        System.out.println( (char) fis.read());
        byte[] chars = new byte[20];
        fis.read(chars);
        System.out.println(new String (chars));

    }
}
