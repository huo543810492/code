import java.util.Scanner;

// 根据键盘输入的字符串，统计大写字母，小写字母，数字，其他，的出现次数
public class StringCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String input = sc.next();
        countString(input);
    }

    public static void countString(String a) {
        char[] temp = a.toCharArray();
        int countUpper = 0;
        int countLower = 0;
        int countNumber = 0;
        int countOther = 0;
        for (int i = 0; i < temp.length; i++) {

            if (temp[i] >= 'A' && temp[i] <= 'Z')
                countUpper++;
            else if (temp[i] >= 'a' && temp[i] <= 'z')
                countLower++;
            else if (temp[i] >= '0' && temp[i] <= '9')
                countNumber++;
            else
                countOther++;
        }
        System.out.println("大写字母个数："+countUpper);
        System.out.println("小写字母个数："+countLower);
        System.out.println("数字个数："+countNumber);
        System.out.println("其他个数："+countOther);
    }
}
