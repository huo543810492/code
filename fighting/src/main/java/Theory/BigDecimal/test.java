package Theory.BigDecimal;

import sun.swing.BakedArrayList;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class test {
    public static void main(String[] args) {

//        BigDecimal c ;
//        int a = 10;
//        long temp = (long)a;
//        System.out.println((temp * 0.01));
//        c = BigDecimal.valueOf((temp * -0.01));
//        System.out.println(c.signum()>0);
//        System.out.println(c);
//        c = c.add(c);
//        System.out.println(c);
//        c = c.multiply(BigDecimal.valueOf((long)100));
//        System.out.println(c.toPlainString() + " %");
//
//        String aaaa = "AC1";
//        System.out.println(aaaa.substring(2));

        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        ListIterator iterator = list.listIterator();
        int j =0;
        for (Integer i : list)
        {
            j++;
            System.out.println("j" + j);
            if (j == list.size()){
                System.out.println("last result");
            }
            System.out.println(i);

        }

        while (!iterator.hasNext()){
            System.out.println("last result");
        }
        BigDecimal x =  new BigDecimal("5.57777777777");
        BigDecimal y =  new BigDecimal("5.555");

        System.out.println(x.setScale(2,BigDecimal.ROUND_DOWN).setScale(6));
//        System.out.println(y.toString());
        BigDecimal xx = new BigDecimal("0.01");
        System.out.println("xx is 0 " + (xx==BigDecimal.ZERO));
        System.out.println(BigDecimal.ZERO);
        System.out.println(!(xx.compareTo(BigDecimal.ZERO)>0 || xx.compareTo(BigDecimal.ZERO)<0));

    }
}
