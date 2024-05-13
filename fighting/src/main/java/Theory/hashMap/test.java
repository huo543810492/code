package Theory.hashMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class test {

    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(2,3);
        map.put(3,3);
        map.put(1,3);
        for(Map.Entry<Integer,Integer> entry : map.entrySet())//这里的Map.Entry都是大写注意
        {
            System.out.println(entry);
        }
        for(Integer key : map.keySet()){
            System.out.println(map.get(key));
        }
    }

}
