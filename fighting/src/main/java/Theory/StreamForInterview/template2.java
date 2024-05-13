package Theory.StreamForInterview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class template2 {

    public static void main(String[] args) {
        //List to Stream 1,5,7,14,22,33
        List<Integer> list = Arrays.asList(1,5,7,14,22,33);
        Stream<Integer> stream = list.stream();

        //Array to Stream
        Integer[] array = {1,5,7,14,22,33};
        Stream<Integer> stream1 = Arrays.stream(array);

        //filter steamFromList greater than 3
//        stream.filter(number -> number>3).forEach(System.out::println);

        //get sum of the list
        //sum() way  need to map Integer to intValue
//        int sum = stream.mapToInt(Integer::intValue).sum();
//        System.out.println(sum);

        //collector way
//        Integer collect = stream.collect(Collectors.summingInt(Integer::intValue));
//        System.out.println(collect);

        //to do average
//        stream.mapToInt(Integer::intValue).average();

        //get max value
//        stream.mapToInt(Integer::intValue).max();

        //convert stream to List
//        List<Integer> collect = stream.collect(Collectors.toList());

        //manipulate each element, times 2, filter which greater than 10;
//        stream.map(number->number*2).filter(number->number>10).forEach(System.out::println);

        //======================================================================================
        //List with Person Object

        List<Person> personList = Arrays.asList(
                new Person("aaa",10),
                new Person("bbb",22),
                new Person("cccc",33));

        //return name as a list
//        List<String> collect = personList.stream().map(Person::getName).collect(Collectors.toList());

        //return person who age > 20
//        personList.stream().filter(Person->Person.getAge()>20).forEach(System.out::println);
    }
}
