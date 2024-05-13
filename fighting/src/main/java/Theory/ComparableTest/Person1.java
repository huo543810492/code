package Theory.ComparableTest;

public class Person1 extends Person {

    private String newattribut;

    public Person1(String name, int age, String newattribut) {
        super(name, age);
        this.newattribut = newattribut;
    }

    public Person1(String name, int age) {
        super(name, age);
    }

    public String getNewattribut() {
        return newattribut;
    }

    @Override
    public String toString() {
        return "Person1{" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() + '\'' +
                "newattribut='" + newattribut +
                '}';
    }

    public void setNewattribut(String newattribut) {
        this.newattribut = newattribut;
    }
}
