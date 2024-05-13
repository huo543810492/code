package Theory.GenericInterface;

public class GenericInterfaceImpl2<T> implements GenericInterface1<T> {
    @Override
    public void method(T t) {
        System.out.println(t);
    }
}
