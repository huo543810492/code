package Theory.StreamForInterview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class template {

    public static void main(String[] args) {
        //List to Stream 1,5,7,14,22,33

        //Array to Stream


        //filter steamFromList greater than 3

        //get sum of the list
        //sum() way  need to map Integer to intValue

        //collector way


        //to do average


        //get max value


        //convert stream to List


        //manipulate each element, times 2, filter which greater than 10;

        //======================================================================================
        //List with Person Object

        List<Person> personList = Arrays.asList(
                new Person("aaa",10),
                new Person("bbb",22),
                new Person("cccc",33));

        //return name as a list


        //return person who age > 20


        //return start with S distinct result
        //List<String> list = Arrays.asList("NewYork", "newyork","Singapore","singapore","SHANGHAI");
    }
}
