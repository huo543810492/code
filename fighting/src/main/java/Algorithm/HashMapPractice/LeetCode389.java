package Algorithm.HashMapPractice;

import java.util.HashMap;
import java.util.Map;

public class LeetCode389 {
//    return '\0'; //注意想返回空的char的时候，不能返回null，这样会报错，返回''也不行，可以返回'\0'

    // //用char数组解决
    // public char findTheDifference(String s, String t) {
    //     char[] charS = s.toCharArray();
    //     char[] charT = t.toCharArray();
    //     char res=' ';
    //     Arrays.sort(charS);
    //     Arrays.sort(charT);
    //     for(int i=0;i<charS.length;i++){
    //         if(charS[i]!=charT[i])
    //             return res=charT[i];
    //     }
    //     return charT[charT.length-1];//注意首先t肯定是长于s的，所以新加的char可能在最后一位
    // }

    //用hashmap解决
    public char findTheDifference(String s, String t) {
        char res=' ';
        Map<Character,Integer> map = new HashMap();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0) + 1);
        }
        for(char c:t.toCharArray()){
            int num = map.getOrDefault(c,0) - 1;
            if(num<0)
                return c;
            map.put(c,num);
        }

        return res;
    }

}
