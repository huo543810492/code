package Algorithm.InterviewFind;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class LeetCode159 {

    public static int lengthOfLongestSubstringTwoDistinct(String s) {
        if(s==null || s.length()==0)
            return 0;
        if(s.length()<3)
            return s.length();
        Map<Character,Integer> map=new HashMap<>();
        int left=0;
        int maxLength=2;
        for(int right=0;right<s.length();right++){
            map.put(s.charAt(right),right);
            if(map.size()==3){
                int index=Collections.min(map.values());
                left=index+1;
                map.remove(s.charAt(index));
            }
            maxLength=Math.max(maxLength,right-left+1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        lengthOfLongestSubstringTwoDistinct("ccaabbb");
    }
}
