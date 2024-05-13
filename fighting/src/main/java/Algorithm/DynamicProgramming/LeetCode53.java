package Algorithm.DynamicProgramming;

public class LeetCode53 {
    public int solveBydp(int[] nums){
        int result=nums[0];
        int[] dp =new int[nums.length];
        dp[0] =nums[0];
        for(int i=1;i<nums.length;i++){
            dp[i] = dp[i-1]<0? nums[i]:(nums[i]+dp[i-1]); //如果前几个数最大子数组值小于0，可以直接扔掉，新开
            result=Math.max(result,dp[i]);
        }
        return result;
    }

}
