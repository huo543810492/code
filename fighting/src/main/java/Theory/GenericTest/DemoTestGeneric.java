package Theory.GenericTest;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.ArrayList;
import java.util.Iterator;

public class DemoTestGeneric {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("伊东美咲");
        String a = "aini";
        printArray(list1,a);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        printArray(list2,2);


    }

    public static <T> void printArray(ArrayList<T> list, T t){
        list.add(t);
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
    }


}
