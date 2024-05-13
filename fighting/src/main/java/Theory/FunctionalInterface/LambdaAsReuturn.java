package Theory.FunctionalInterface;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaAsReuturn {
    public static Comparator<String > getComparator(){
        //普通的匿名内部类
//        return new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o2.length() - o1.length();
//            }
//        };
        return (o1,o2)->o2.length()-o1.length();
    }

    public static void main(String[] args) {
        String[] arr1 = {"aaaa","b","cccccccccc"};
        System.out.println(Arrays.toString(arr1));
        Arrays.sort(arr1,getComparator());
        System.out.println(Arrays.toString(arr1));
    }
}
