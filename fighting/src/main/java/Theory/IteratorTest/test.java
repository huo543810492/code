package Theory.IteratorTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class test
{
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        Collections.addAll(arr,1,2,3,4);
        Iterator<Integer> ir =  arr.iterator();
        while (ir.hasNext()){
            System.out.println(ir.next());
        }
        System.out.println("list is " + arr);
    }
}
