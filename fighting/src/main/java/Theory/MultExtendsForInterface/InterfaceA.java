package Theory.MultExtendsForInterface;

public interface InterfaceA {
    public abstract void methodA ();
    public default  void defaultA(){
        System.out.println("");
    }
}
