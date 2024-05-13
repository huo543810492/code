package Theory.RemoveListDuplicate;

import java.math.BigInteger;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class test {
    private static int i =1 ;
    private static HashMap<String, String> hMap1 = new HashMap<String, String>();

    public static void main(String[] args) throws ParseException {
        List<record> r = createList();

        System.out.println("result :" + removeDuplicate(r));
        System.out.println(r.size());
//        System.out.print(" aa b  ".trim());
//        System.out.print(" aa b".trim());
        HashMap<String, String> hMap = new HashMap<String, String>();

        hMap1.put("key1", "value1");
        hMap1.put("key2", "value2");
        System.out.println("HashMap size is: " + hMap1.size());
        System.out.println(i);
    }



    public static List<record> createList() throws ParseException {
        List<record> records = new ArrayList<record>();
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        String input = "1818-11-11";
        Date d1 = ft.parse(input);

        records.add(new record("1",d1,"value1"));
        records.add(new record("2",d1,"value2"));
        records.add(new record("1",d1,"value3"));
        System.out.println("createList :" + records);
        return records;
    }
    public static List<record> removeDuplicate(List<record> records){
        Map<String,record> maps = new LinkedHashMap<>();
        for(record record : records){
            maps.put(record.getID()+record.getDate().toString(),record);
            System.out.println("create map :" + maps);
        }
        System.out.println("map :" + maps);
        List <record> result = new ArrayList<record>(maps.values());
        return result;
    }
}
