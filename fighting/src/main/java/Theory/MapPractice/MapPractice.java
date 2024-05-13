package Theory.MapPractice;

import java.util.*;

public class MapPractice {
    public static void main(String[] args) {
        Map<String ,Integer> map = new HashMap<>();
        map.put("伊东美咲",18);
        map.put("东凛",18);
        map.put("松井珠理奈",18);
        Set<String> set = new HashSet<>();
        set = map.keySet();
        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            String key = it.next();
            Integer value = map.get(key);
           System.out.println(key +"=" +value) ;
        }
//        for (String s : set) {
//            System.out.println(s +"=" +map.get(s)) ;
//        }
    }
}
