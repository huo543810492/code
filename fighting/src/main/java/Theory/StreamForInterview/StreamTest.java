package Theory.StreamForInterview;

import com.sun.org.apache.xpath.internal.objects.XNumber;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        //List to Stream
        List<Integer> list = Arrays.asList(1,5,7,14,22,33);
        Stream<Integer>  steamFromList = list.stream();

        //Array to Stream
        Integer[] array = {1,5,7,14,22,33};
        Stream<Integer> steamFromArray = Arrays.stream(array);
        //filter steamFromList greater than 3
//        steamFromArray.filter(number -> number>3).forEach(number -> System.out.println(number));

        //get sum of the list
        //sum() way  need to map Integer to intValue
//        int sum = steamFromList.mapToInt(Integer::intValue).sum();
//        System.out.println(sum);
        //collector way
//        Integer collect = steamFromList.collect(Collectors.summingInt(Integer::intValue));
//        System.out.println(collect);

        //to do average
//        OptionalDouble average = steamFromList.mapToInt(Integer::intValue).average();
//        System.out.println(average.getAsDouble());

        //get max value
//        OptionalInt max = steamFromList.mapToInt(Integer::intValue).max();
//        System.out.println(max.getAsInt());

        //convert stream to List
//        List<Integer> collect = steamFromList.collect(Collectors.toList());
//        System.out.println(collect);

        //manipulate each element, times 2, filter which greater than 10;
//        steamFromList.map(number->number*2).filter(number->number>10).forEach(number-> System.out.println(number));

        //======================================================================================
        //List with Person Object

        List<Person> personList = Arrays.asList(
                new Person("aaa",10),
                new Person("bbb",22),
                new Person("cccc",33));

        //return name as a list
//        List<String> nameList = personList.stream().map(Person -> Person.getName()).collect(Collectors.toList());
//        System.out.println(nameList.toString());

        //return person who age > 20
//        List<Person> collect = personList.stream().filter(person -> person.getAge() > 20).collect(Collectors.toList());
//        for(Person p:collect)
//            System.out.println(p.toString());

//        List<String> list = Arrays.asList("NewYork", "newyork","Singapore","singapore","SHANGHAI");
//        list.stream().map(name->name.toUpperCase()).distinct().filter(name->name.startsWith("S")).forEach(System.out::println);
    }
}
