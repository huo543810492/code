package Interview.interviewAlgorithms;

import java.util.HashSet;
import java.util.Set;

/**
 * 计算给定字符串中，有多少个数字可以通过改变其中的某一位数字而使得整个数字可被3整除。
 */
public class DivisibleBy3 {
    public static int solution(String s){
        int totalSum = 0;
        char[] chars = s.toCharArray();
        Set<String> set = new HashSet<>();
        for(char c : chars){
            totalSum+=Character.getNumericValue(c);
        }
        for(int i=0; i<chars.length; i++){
            int otherSum = totalSum - Character.getNumericValue(chars[i]);
            for(int j=0;j<10;j++){
                if((otherSum+j)%3==0){
                    StringBuilder stringBuilder = new StringBuilder(s);
                    stringBuilder.setCharAt(i, (char) ('0'+j));
                    set.add(stringBuilder.toString());
                }
            }
        }
        System.out.println(set.toString());
        return set.size();
    }

    public static void main(String[] args) {
        System.out.println(solution("022"));
    }
}
