package Interview.interviewAlgorithms;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Test {

    public static int lengthOfLongestSubstringTwoDistinct(String s) {
        if(s==null || s.length()==0)
            return 0;
        if(s.length()<=2)
            return s.length();
        int leftMostIndex=0;
        int res=0;

        Map<Character,Integer> map=new HashMap();
        char[] chars=s.toCharArray();
        for(int i=0;i<chars.length;i++){
            map.put(chars[i],i+1);
            while(map.size()>=3){
                leftMostIndex= Collections.min(map.values());
                char temp=chars[leftMostIndex];
                map.remove(temp);
            }
            res=Math.max(res,i-leftMostIndex+1);
        }
        return res;
    }
    public static void main(String[] args) {
        lengthOfLongestSubstringTwoDistinct("ccaabbb");
    }
}
