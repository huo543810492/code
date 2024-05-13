package Theory.MultExtendsForInterface;

public interface InterfaceB {
    public abstract void methodB();
    public default  void defaultA(){
        System.out.println("");
    }
}
