package Theory.TestConstructor;

public class Child extends Parent {
    private String name;
    private int age;

    public Child(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("调用子类带参构造方法");
    }

    public Child(){
        System.out.println("调用子类不带参构造方法");
    }

}
