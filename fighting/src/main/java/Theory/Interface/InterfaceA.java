package Theory.Interface;
//default方法可以解决接口升级问题，并且该方法还可以被重写
public interface InterfaceA {
    public abstract void methodA();


    public default void methodDefault(){
        System.out.println("这是一个默认方法");
    }



}
