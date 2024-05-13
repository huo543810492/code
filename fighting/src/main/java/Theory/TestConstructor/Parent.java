package Theory.TestConstructor;

public class Parent {
    private String name;
    private int age;

    public Parent(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("调用父类带参构造方法");
    }

    public Parent(){
        System.out.println("调用父类不带参构造方法");
    }

}
