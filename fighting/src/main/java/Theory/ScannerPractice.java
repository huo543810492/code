import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScannerPractice {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("输入几个数字？");
        int num = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        for (int i=0; i<num; i++){
            Scanner sc2 = new Scanner(System.in);
            int next = sc2.nextInt();
            list.add(next);
        }
        for(int i : list){
            System.out.println("输入的数字有：");
            System.out.println(i);
        }
    }
}
