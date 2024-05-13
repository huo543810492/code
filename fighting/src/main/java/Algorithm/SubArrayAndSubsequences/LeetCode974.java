package Algorithm.SubArrayAndSubsequences;

import java.util.HashMap;
import java.util.Map;

public class LeetCode974 {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int res=0;
        map.put(0,1);//别忘了这个关键
        for(int num:nums){
            sum=(sum+num)%k;//除法的变形
            sum=sum<0? sum+k:sum;//处理负数
            res=res+map.getOrDefault(sum,0);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return res;
    }
}
