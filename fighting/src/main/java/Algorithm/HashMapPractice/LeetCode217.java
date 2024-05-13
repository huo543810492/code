package Algorithm.HashMapPractice;

import java.util.HashMap;
import java.util.Map;

public class LeetCode217 { //也可以用HashSet来做
    public boolean containsDuplicate(int[] nums) { //这个比较简单
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int i = 0; i<nums.length; i++){
            if (map.get(nums[i]) == null){  //注意是null 而不是0
                map.put(nums[i],1);
            }
            else{
                return true;
            }
        }
        return false;
    }
}
