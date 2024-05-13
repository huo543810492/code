package Theory.InterviewFind;

import java.util.Objects;

public class Person {
    private String name;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    private Integer age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(age, person.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
