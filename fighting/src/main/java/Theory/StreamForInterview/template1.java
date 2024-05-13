package Theory.StreamForInterview;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class template1 {

    public static void main(String[] args) {
        //List to Stream 1,5,7,14,22,33
        Stream<Integer> stream = Arrays.asList(1, 5, 7, 14, 22, 33).stream();
        //Array to Stream
        Integer[] array={1,5,7,14,22,33};
        Stream<Integer> stream1 = Arrays.stream(array);

        //filter steamFromList greater than 3
//        stream.filter(number -> number>3).forEach(number -> System.out.println(number));

        //get sum of the list
        //sum() way  need to map Integer to intValue
//        int sum = stream.mapToInt(Integer::intValue).sum();
//        System.out.println(sum);

        //collector way
//        Integer collect = stream.collect(Collectors.summingInt(Integer::intValue));
//        System.out.println(collect);

        //to do average
//        OptionalDouble average = stream.mapToInt(Integer::intValue).average();
//        System.out.println(average.getAsDouble());

        //get max value
//        OptionalInt max = stream.mapToInt(Integer::intValue).max();
//        System.out.println(max.getAsInt());

        //convert stream to List
//        List<Integer> collect = stream.collect(Collectors.toList());

        //manipulate each element, times 2, filter which greater than 10;
        List<Integer> collect = stream.map(number -> number * 2).filter(number->number>10).collect(Collectors.toList());
        System.out.println(collect);
        //======================================================================================
        //List with Person Object

        List<Person> personList = Arrays.asList(
                new Person("aaa",10),
                new Person("bbb",22),
                new Person("cccc",33));

        //return name as a list
//        List<String> nameList = personList.stream().map(Person::getName).collect(Collectors.toList());
//        System.out.println(nameList);

        //return person who age > 20
        personList.stream().filter(Person -> Person.getAge()>20).forEach(System.out::println);
    }
}
