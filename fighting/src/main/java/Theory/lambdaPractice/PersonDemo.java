package Theory.lambdaPractice;

import java.util.Arrays;
import java.util.Comparator;

public class PersonDemo {
    public static void main(String[] args) {
        Person [] arr= { new Person("大白",19),
                new Person("伊东美咲",18)};
//        Arrays.sort(arr, new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getAge()-o2.getAge();
//            }
//        });

        Arrays.sort(arr, (Person o1,Person o2)-> {
                return o1.getAge()-o2.getAge();
        });
        System.out.println(Arrays.toString(arr));
    }

}
