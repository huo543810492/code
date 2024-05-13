package Interview;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class interview3 {
    public static void main(String[] args) {
        Date date;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
             date = sdf.parse("2022-0101");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("date");

    }
}
