package Algorithm;

public class StringTest {
    public static void main(String[] args) {
        String a="005-555";
        String[] strings = a.split("-");
        System.out.println(strings[0]);//005
        System.out.println(strings[1]);//555
        System.out.println(a.substring(0,3));//005
    }

}
