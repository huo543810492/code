package Theory.AnonymousInnerClass;

public class MainDemo {
    public static void main(String[] args) {
        MyInterface myInterface = new MyInterface() {
            @Override
            public void method() {
                System.out.println("内部类的实现！！");
            }
        };


        myInterface.method();
    }
}
