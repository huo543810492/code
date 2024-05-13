package Algorithm.Top100LikedQuestions;

import java.util.HashMap;
import java.util.Map;

public class LeetCode1 {
    //Brute Force
    // public int[] twoSum(int[] nums, int target) {
    //     for(int i=0;i<nums.length;i++){
    //         for(int j=i+1;j<nums.length;j++){
    //             if(nums[i]+nums[j]==target)
    //                 return new int[] {i,j};
    //         }
    //     }
    //     return null;
    // }

    //One Pass
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int remain=target-nums[i];
            if(map.get(remain)==null)
                map.put(nums[i],i);
            else
                return new int[] {i,map.get(remain)};
        }
        return null;
    }
}
