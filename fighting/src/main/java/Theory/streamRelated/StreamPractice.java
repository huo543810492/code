package Theory.streamRelated;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPractice {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("葛大白");
        list.add("邢微");
        list.add("邢微A");
        list.add("邢微B");
        list.add("邢微C");
        list.add("张微A");

        Stream<String> team1 = list.stream().filter(name->name.length()==3).limit(3);
        Stream<String> team2 = list.stream().filter(name -> name.startsWith("邢")).skip(2);
        Stream<String> team = Stream.concat(team1, team2);
        List<Person> personList = team.map(name -> new Person(name, 1)).collect(Collectors.toList());
        personList.forEach(System.out::println);
    }
}
