package Theory.ObjectEquals;

import com.sun.org.apache.xpath.internal.operations.Equals;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        boolean b=false;
        if (obj instanceof Person)
        {
            Person temp = (Person) obj;
            b = this.age== temp.age && this.name==temp.name;
        }
        return b;
    }
}
