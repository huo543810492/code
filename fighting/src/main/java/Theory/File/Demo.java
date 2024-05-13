package Theory.File;

import java.io.File;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
        show();
    }

    private static void show() throws IOException {
        File f1 = new File("D:\\编程\\tmall_Springboot\\final project\\Demo\\src\\File\\a.txt");
        String absoluatePath1 = f1.getAbsolutePath();
        System.out.println(absoluatePath1);

        File f2 = new File("a.txt");
        String absoluatePath2 = f2.getAbsolutePath();
        System.out.println(absoluatePath2);

        File f3 = new File("n.txt");
        String absoluatePath3 = f3.getAbsolutePath();
        System.out.println(absoluatePath3);

        System.out.println("===============================");
        System.out.println(f2.exists());
        System.out.println(f3.exists());

        System.out.println("===============================");
        File f4= new File("D:\\编程\\tmall_Springboot\\final project\\Demo\\src\\File\\1.txt");
        System.out.println(f4.createNewFile());
    }
}
