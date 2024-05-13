package Theory.GenericInterface;

public class GenericInterfaceImpl1 implements GenericInterface1<String> {
    @Override
    public void method(String s) {
        System.out.println(s);
    }
}
