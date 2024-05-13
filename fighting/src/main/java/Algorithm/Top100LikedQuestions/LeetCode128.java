package Algorithm.Top100LikedQuestions;

import java.util.HashMap;
import java.util.Map;

public class LeetCode128 {
    public int longestConsecutive(int[] nums) {
        if(nums==null || nums.length==0)
            return 0;
        Map<Integer,Boolean> map = new HashMap();
        int res=1;
        for(int num:nums){
            map.put(num,false);
        }
        for(int num:nums){
            if(!map.containsKey(num-1))//非常关键，找到那个起始位置, 也就是说只从最小的值开始遍历
            {
                int count = 1;
                int index=num;
                map.put(index,true);  //已经探索过了，不要再探索了，也是O(n)的关键
                while(map.containsKey(index+1)){
                    count++;
                    index++;
                    map.put(index,true);
                }
                res = Math.max(res,count);
            }
        }
        return res;
    }
}
