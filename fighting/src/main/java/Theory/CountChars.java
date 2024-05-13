import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CountChars {
    public static void main(String[] args) {
        System.out.println("Please input a String");
        Scanner s = new Scanner(System.in);
        Map<String,Integer> map = Count(s.next());
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        for (Map.Entry<String, Integer> set : entrySet) {
            String key = set.getKey();
            Integer value = set.getValue();
            System.out.println(key +" : " + value);
        }

    }
    private static Map<String,Integer> Count(String s) {
        HashMap<String, Integer> map = new HashMap<>();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            String key = String.valueOf(c);
            if(map.containsKey(key)){
                map.put(key,map.get(key)+1);
            }
            else {
                map.put(key,1);
            }
        }
        return map;
    }
}
