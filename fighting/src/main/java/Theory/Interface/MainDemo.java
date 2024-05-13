package Theory.Interface;

public class MainDemo {
    public static void main(String[] args) {
        InterfaceAImpl1 a = new InterfaceAImpl1();
        a.methodA();

        InterfaceAImpl2 b = new InterfaceAImpl2();
        b.methodA();


        System.out.println("===========================");

        a.methodDefault();

        b.methodDefault();
    }
}
