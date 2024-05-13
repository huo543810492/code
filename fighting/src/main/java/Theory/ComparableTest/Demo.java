package Theory.ComparableTest;

import java.util.ArrayList;
import java.util.Collections;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Person> p = new ArrayList<>();
        Person p1 = new Person("b伊东美咲",18);
        Person p2 = new Person("a东凛",18);
        Person p3 = new Person("a松井珠理奈",17);
        Collections.addAll(p,p1,p2,p3);
        System.out.println(p);

        Collections.sort(p);
        System.out.println(p);

        Person1 pp1 = new Person1("测试继承",14,"ceshi");
        System.out.println(pp1);

        Person pppp1 =  new Person1("测试继承2",15);
        System.out.println(pppp1);

    }
}
