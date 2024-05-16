package Interview.interviewAlgorithms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**题目给的英文是decimal，我以为是多少个小数位，原来是十进制的意思，学到了
 * 给一个由0和1组成的二进制字符串，返回由这个字符串，且保证顺序的情况下，能组成多少个不同的十进制整数
 * 比如"010" 可以组成"0","01","1","10","010"，
 * 这些子序列对应的十进制数分别是：0, 1, 1, 2, 2
 * 其中不重复的十进制数是：0, 1, 2
 */

public class UniqueDecimalCount {

    public static int getCount(String binary) {
        Set<Integer> uniqueDecimals = new HashSet<>();

        // 初始化一个空的子序列集合，确保至少有一个空字符串开始，用于保证单个数字的可能性，
        // 即从那个数字开始的情况，然后由于空字符串加任何数字，在转换成十进制的时候还会是改数字本身
        Set<String> currentSubsequences = new HashSet<>();
        currentSubsequences.add("");
        // 创建一个currentSubsequences和newSubsequences的原因是，不能一边遍历一边修改一个list
        for (char c : binary.toCharArray()) {
            Set<String> newSubsequences = new HashSet<>();
            // 为每个已存在的子序列添加当前字符
            for (String subseq : currentSubsequences) {
                // 继续当前子序列，不添加当前字符
                newSubsequences.add(subseq);
                // 添加当前字符到子序列中
                String newSubsequence = subseq + c;
                newSubsequences.add(newSubsequence);
                // 如果子序列不为空，则计算其十进制值
                if (!newSubsequence.isEmpty()) {
                    // 把二进制数转成十进制的方法！
                    int decimalValue = Integer.parseInt(newSubsequence, 2);
                    uniqueDecimals.add(decimalValue);
                }
            }
            // 更新当前所有可能的子序列集
            currentSubsequences = newSubsequences;
        }

        // 返回唯一的，十进制数的数量
        return uniqueDecimals.size();
    }

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        int[] arr = a.stream().mapToInt(Integer::intValue).toArray();
        String binary = "010";
        System.out.println("Number of unique decimal representations: " + getCount(binary));
    }
}