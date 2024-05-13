package Theory.StreamForCollectinon;

import java.util.stream.Stream;

public class demoStream {
    public static void main(String[] args) {
        Stream<String> list1 = Stream.of("大白", "伊东美咲", "小东凛", "小东凛", "小东凛", "大东凛", "大东凛");
        Stream<String> list2 = list1
                .filter(name -> name.length() == 3)
                .limit(3);

        Stream<String> list3 = Stream.of("张大白","张伊东美咲","张东凛","张东凛","张小东凛","大张东凛","张大东凛");
        Stream<String> list4 = list3.filter(name -> name.startsWith("张"))
                .skip(2);

//        Stream<String> concat = Stream.concat(list2, list4);
//        Stream<Person> final;
//        concat.forEach(name -> final.add (new Person(name,18)));

        Stream.concat(list2,list4).map(name -> new Person(name,18)).forEach(p-> System.out.println(p));
    }
}
