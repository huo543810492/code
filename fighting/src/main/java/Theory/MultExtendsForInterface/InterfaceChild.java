package Theory.MultExtendsForInterface;
//多继承，对于接口来说，多个父接口抽象方法重复无所谓，如果默认方法重复的话，必须对默认方法进行覆盖重写
public interface InterfaceChild extends InterfaceA,InterfaceB {
    public abstract void methodChild();

    @Override
    default void defaultA() {

    }
}
