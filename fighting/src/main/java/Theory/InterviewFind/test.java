package Theory.InterviewFind;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class test {
    public static void main(String[] args) {
        Person p1 = new Person("a",1);
        Person p2 = new Person("a",1);
        Person p3 = new Person("b",1);
        Map<Integer,Person> map=new HashMap<>();
        map.put(1,p1);
        map.put(2,p2);
        map.put(3,p3);
        System.out.println(map);

        Set<Person> set = new HashSet<>();
        set.add(p1);
        set.add(p2);
        set.add(p3);
        System.out.println(set);
    }
}
