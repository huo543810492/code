package Algorithm.SubArrayAndSubsequences;

import java.util.HashMap;
import java.util.Map;

public class LeetCode300 {
    //n^2
    public int lengthOfLIS(int[] nums) {
        int res=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:nums){

            int tempCount=0;
            for(Map.Entry<Integer,Integer>entry:map.entrySet()){
                if(entry.getKey()<num)
                    tempCount=Math.max(tempCount,entry.getValue());
            }

            tempCount++;
            res=Math.max(res,tempCount);
            map.put(num,tempCount);
        }
        return res;
    }
}
