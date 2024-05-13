package Theory.testNewObjectInLoop;

import java.util.ArrayList;
import java.util.List;

public class test
{
    public static void main(String[] args) {
        Student s1 = new Student();
        List<Student> list =new ArrayList<Student>();
        for (int i = 0; i < 20; i++) {

            s1.setAge(3+i);
            s1.setNamd("白" + i);
            list.add(s1);
        }

        System.out.println(list.toString());
        Student s2 = s1;
        System.out.println("s2" + s2);
    }
}
