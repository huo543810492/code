import java.util.Arrays;

public class ArraysPractice {
    //用Arrays将字符串升序排列并且倒序打印

    public static void main(String[] args) {
        String a = "asdagasjioja";
        //如何把字符串转换成数组？toCharArray!!!
        char[] chars = a.toCharArray();
        //再用Arrays 的sort方法
        Arrays.sort(chars);
        for (int i = chars.length-1; i >=0; i--) {
            System.out.println(chars[i]);
        }
    }
}
