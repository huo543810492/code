package Theory.StreamForInterview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class template3 {

    public static void main(String[] args) {
        //List to Stream 1,5,7,14,22,33
        Stream<Integer> steamFromList = Arrays.asList(1, 5, 7, 14, 22, 33).stream();
        //Array to Stream
        IntStream stream1 = Arrays.stream(new int[]{1, 5, 7, 14, 22, 33});

        //filter steamFromList greater than 3
//        steamFromList.filter(number->number>3).forEach(System.out::println);

        //get sum of the list
//        System.out.println(steamFromList.mapToInt(Integer::intValue).sum());

        //sum() way  need to map Integer to intValue

        //collector way
//        System.out.println(steamFromList.collect(Collectors.summingInt(Integer::intValue)));

        //to do average
//        System.out.println(steamFromList.mapToInt(Integer::intValue).average());

        //get max value
//        System.out.println(steamFromList.mapToInt(Integer::intValue).max());

        //convert stream to List
//        List<Integer> collect = steamFromList.map(number -> number * 2).collect(Collectors.toList());
//        System.out.println(collect);

        //manipulate each element, times 2, filter which greater than 10;
//        steamFromList.map(number->number*2).filter(number->number>10).forEach(System.out::println);
        //======================================================================================
        //List with Person Object

        List<Person> personList = Arrays.asList(
                new Person("aaa",10),
                new Person("bbb",22),
                new Person("cccc",33));

        //return name as a list
//        List<String> collect = personList.stream().map(Person::getName).collect(Collectors.toList());
//        System.out.println(collect);

        //return person who age > 20
//        personList.stream().filter(Person-> Person.getAge()>20).forEach(System.out::println);

        //return start with S(Ingore case) distinct result
//        List<String> list = Arrays.asList("NewYork", "newyork","Singapore","singapore","SHANGHAI");
//        list.stream().map(country->country.toLowerCase()).filter(country->country.startsWith("s")).distinct().forEach(System.out::println);
    }
}
