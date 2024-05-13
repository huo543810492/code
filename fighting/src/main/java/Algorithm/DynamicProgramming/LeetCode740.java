package Algorithm.DynamicProgramming;

import java.util.Arrays;

public class LeetCode740 {
    public int deleteAndEarn(int[] nums) {
        if(nums.length==1)
            return nums[0];
        Arrays.sort(nums);
        int[] sum= new int[nums[nums.length-1]+1];

        for(int i :nums){
            sum[i]++;
        }

        int[] dp=new int[sum.length];
        dp[0]=sum[0];
        dp[1]=sum[1];
        int result=0;
        for(int i=2;i<dp.length;i++){
            dp[i] = Math.max(dp[i-1],(dp[i-2]+sum[i]*i));
            result=Math.max(result,dp[i]);
        }
        return result;
    }
}
