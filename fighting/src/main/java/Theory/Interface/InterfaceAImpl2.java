package Theory.Interface;

public class InterfaceAImpl2 implements InterfaceA{

    @Override
    public void methodA() {
        System.out.println("InterfaceAImpl2 实现了接口");
    }

    @Override
    public void methodDefault() {
        System.out.println("InterfaceAImpl2 修改了默认方法");
    }
}
