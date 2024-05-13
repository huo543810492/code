package Theory.testStatic;

import java.util.HashMap;
import java.util.Map;

public class demo {
    public static void main(String[] args) {
//        Student.setRoom("room 1 ");
//        Student s2 = new Student("大白沉稳", 19);
//        System.out.println(s1.getRoom());
//        System.out.println(s2.getRoom());

        Student s1 = new Student("大白沉稳", 18);

        Map<String,Student> map = new HashMap<>();
        map.put("student",s1);

        Map<String,Student> mapNew = new HashMap<>();
        mapNew.putAll(map);

        HashMap<String,Student> hashMap = new HashMap<>();
        hashMap.putAll(map);

        System.out.println(mapNew.get("student"));
        System.out.println(hashMap.get("student"));

        s1.setAge(50);
        System.out.println(mapNew.get("student"));
        System.out.println(hashMap.get("student"));

        map.remove("student");
        System.out.println(mapNew.get("student"));
        System.out.println(hashMap.get("student"));
        System.out.println(map.get("student"));

        Integer a = new Integer(1);
        Map<Integer,Integer> map1 = new HashMap<>();
        map1.put(a,a);

        Map<Integer,Integer> mapNew1 = new HashMap<>();
        mapNew1.putAll(map1);

        HashMap<Integer,Integer> hashMap1= new HashMap<>();
        hashMap1.putAll(map1);

        System.out.println(mapNew1.get(a));
        System.out.println(hashMap1.get(a));
        map1.put(a,a+1);
        System.out.println("======================");
        System.out.println(map1.get(a));
        System.out.println(mapNew1.get(a));
        System.out.println(hashMap1.get(a));

    }
}
