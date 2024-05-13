package Algorithm.ProxyTest;

import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        LearnImpl learn = new LearnImpl();
//        ProxyInvocationHandler pih = new ProxyInvocationHandler();
//        pih.setTarget(learn);
//        Learn proxy = (Learn) pih.getProxy();
//        proxy.howToLearn();//如果这个方法被注掉，都不会走到invoke方法

        Learn proxy = getProxy(Learn.class,learn);
        proxy.howToLearn();

    }

    private static <T> T getProxy(Class<T> learnClass,Object target) {
        ClassLoader classLoader = learnClass.getClassLoader();
        Class<?>[] interfaces = new Class[]{learnClass};
        Object o = Proxy.newProxyInstance(classLoader,interfaces,(proxy,method,args)->{
            System.out.println(method.getName());
            method.invoke(target,args);
            return null;
        });
        return (T)o;

    }
}
