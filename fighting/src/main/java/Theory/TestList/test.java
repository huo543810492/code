package Theory.TestList;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        List1 a = new List1();
       a.setList(new ArrayList<Integer>());
        System.out.println(a.getList() == null);


    }
}
