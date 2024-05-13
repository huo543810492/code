package Theory;

import java.util.Arrays;

public class DataConvertionTest {
    public static void main(String[] args) {
        String a = "abc";
        char[] chars = a.toCharArray(); //字符串到char
        String b= String.valueOf(chars);//char到字符串
        byte[] bytes = a.getBytes();//字符串到字节
        new String(bytes);//字节到字符串

        System.out.println(b);
        System.out.println(Arrays.toString(chars));
        System.out.println(new String(bytes));

    }
}
