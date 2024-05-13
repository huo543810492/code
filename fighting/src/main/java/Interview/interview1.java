package Interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class interview1 {
    static int res=0;
    public static void findTargetSumWays(int[] nums, int target) {
        findTarget(nums, 0, target, 0);
    }
    public static void findTarget(int[] nums, int sum, int target, int index){
        if(index==nums.length){
            if(sum == target){
                res++;
                return;
            }
            else
                return;
        }
        findTarget(nums,sum+nums[index],target,index+1);
        findTarget(nums,sum-nums[index],target,index+1);
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1};
        findTargetSumWays(nums,3);
        System.out.println(res);
        String s = "a";
        s.length();
        Map<Integer,Integer> map = new HashMap<>();
        Arrays.sort(s.toCharArray());
    }
}
