package Theory.StreamForCollectinon;

import java.util.ArrayList;
import java.util.Collections;
//传统方法做集合元素的处理
public class demo {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1,"大白","伊东美咲","小东凛","小东凛","小东凛","大东凛","大东凛");
        ArrayList<String> list2 = new ArrayList<>();
        for (String s : list1) {
            if (s.length() == 3)
                list2.add(s);
        }
        ArrayList<String> list3 = new ArrayList<>();
        for (int i = 0; i < list2.size(); i++) {
            if (i<3)
                list3.add(list2.get(i));
        }
        System.out.println(list3);

        ArrayList<String> list4 = new ArrayList<>();
        Collections.addAll(list4,"张大白","张伊东美咲","张东凛","张东凛","张小东凛","大张东凛","张大东凛");
        ArrayList<String> list5 = new ArrayList<>();
        for (String s : list4) {
            if (s.startsWith("张"))
                list5.add(s);
        }
        ArrayList<String> list6 = new ArrayList<>();
        for (int i = 0; i < list5.size(); i++) {
            if (i>1)
                list6.add(list5.get(i));
        }
        System.out.println(list6);

        ArrayList<String> listfinal = new ArrayList<>();
        listfinal.addAll(list6);
        listfinal.addAll(list3);

        ArrayList<Person> list = new ArrayList<>();
        for (int i = 0; i < listfinal.size(); i++) {
            list.add(new Person(listfinal.get(i),18));
        }
        System.out.println(list);
    }
}
