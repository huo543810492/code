package Interview.interviewAlgorithms;

import java.util.Collections;
import java.util.HashMap;

/**
 * 蚂蚁，没做出来的算法题，给个字符串，使用的字符不能超过2的前提下，返回能找到最多连续的数目，比如 aabb 返回4  abcc 返回3 ccaabbb 返回5
 *
 * 是乐扣159， 通过记录字符的最后一次出现的索引，而不是字符出现的次数来更简单地管理滑动窗口的边界。当窗口中存在超过两个唯一字符时，
 * 您可以缩小窗口直到再次只包含两个唯一字符。这种方法允许直接调整窗口的左边界，而不必每次都计算所有字符的频次。
 */
public class LeetCode159 {
    public static void main(String[] args) {
        System.out.println(findMaxString("aabb"));      // Output: 4
        System.out.println(findMaxString("abcc"));      // Output: 3
        System.out.println(findMaxString("ccaabbb"));   // Output: 5
    }

    public static int findMaxString(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        int left=0,result=0;
        char[] chars = s.toCharArray();
        for (int right = 0; right < chars.length; right++) {
            char c = chars[right];
            map.put(c,right);
            if(map.size()>2){
                //find the leftmost char in the map
                Integer minIndex = Collections.min(map.values());
                char minChar = chars[minIndex];
                map.remove(minChar); //remove the smallest index char
                //下面已经加一了，为什么这里还要加一? 因为从map取出的index是最左的位置，要被移除的index，向右一位才是满足不超过2个字符的位置，也就是left
                left = minIndex + 1;//move the left boundary of the window
            }

            result = Math.max(result, right-left+1); //这里计算肯定是要加一的
        }
        return result;
    }
}
