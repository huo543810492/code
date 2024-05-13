package Theory.StreamForInterview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class template4 {

    public static void main(String[] args) {
        //List to Stream 1,5,7,14,22,33
        List<Integer> list = Arrays.asList(1,5,7,14,22,33);
        Stream<Integer> stream = list.stream();
        //Array to Stream
        int[] arr=new int[]{1,5,7,14,22,33};
        IntStream stream1 = Arrays.stream(arr);
        //filter steamFromList greater than 3
//        stream.filter(num->num>3).forEach(System.out::println);
        //get sum of the list
        //sum() way  need to map Integer to intValue
//        stream.mapToInt(Integer::intValue).sum();
        //collector way
//        stream.collect(Collectors.summingInt(Integer::intValue));

        //to do average
//        stream.mapToInt(Integer::intValue).average();

        //get max value
//        stream.mapToInt(Integer::intValue).max();

        //convert stream to List
//        stream.collect(Collectors.toList());

        //manipulate each element, times 2, filter which greater than 10;
//        stream.map(num->num*2).filter(num->num>10).forEach(System.out::println);
        //======================================================================================
        //List with Person Object

        List<Person> personList = Arrays.asList(
                new Person("aaa",10),
                new Person("bbb",22),
                new Person("cccc",33));

        //return name as a list
//        personList.stream().map(Person::getName).collect(Collectors.toList());

        //return person who age > 20
//        personList.stream().filter(person -> person.getAge()>20);

        //return start with S distinct result
        List<String> list1 = Arrays.asList("NewYork", "newyork","Singapore","singapore","SHANGHAI");
//        list1.stream().map(s -> s.toLowerCase()).distinct().filter(s -> s.startsWith("s"));
    }
}
