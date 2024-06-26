package Algorithm.DynamicProgramming;

public class LeetCode198 {
    public int rob(int[] nums) {
        if(nums.length==1)
            return nums[0];
        if(nums.length==2)
            return Math.max(nums[0],nums[1]);
        int[] dp=new int[nums.length];
        dp[0]=nums[0];
        dp[1]=Math.max(nums[1],nums[0]);//非常关键，要保证dp[1]也是最大值啊
        for(int i=2;i<dp.length;i++)
        {
            dp[i]=Math.max(dp[i-2]+nums[i],dp[i-1]);
        }
        return dp[dp.length-1];
    }
}
