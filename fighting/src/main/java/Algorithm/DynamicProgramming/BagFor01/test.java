package Algorithm.DynamicProgramming.BagFor01;

import java.util.Arrays;

public class test {
    static int res=0;

    public static boolean canPartition(int[] nums) {
        int sum=0;
        for(int num:nums)
            sum+=num;
        if(sum%2!=0)
            return false;
        Arrays.sort(nums);
        sum=sum/2;
        boolean[][] dp=new boolean[nums.length][sum+1];
        for(int j=0;j<dp[0].length;j++)
            if(nums[0]==j)
                dp[0][j]=true;

        for(int i=1;i<dp.length;i++)
        {
            for(int j=1;j<dp[0].length;j++)
            {
                if(j<nums[i])
                    dp[i][j]=dp[i][j];
                else
                    dp[i][j]=dp[i][j-nums[i]]==true? true:dp[i][j];
                if(nums[i]==j)
                    dp[i][j]=true;

                if(j==(dp[0].length-1) && dp[i][j]==true)
                    return true;
            }
        }
        return false;
    }

    public static void dpTwoDArray(int[] nums, int target) {
        int sum=0;
        for(int num:nums)
            sum+=num;
        if(sum<target)
        {
            res=0;
            return;
        }
        if((sum+target)%2!=0)
            return;
        target=(sum+target)/2;
        int[][] dp=new int[nums.length+1][target+1];
        dp[0][0]=1;
        for(int i=1;i<dp.length;i++)
        {
            int curr=nums[i-1];
            for(int j=0;j<dp[0].length;j++)
            {
                if(j>=curr)
                    dp[i][j]=dp[i-1][j]+dp[i-1][j-curr];
                else
                    dp[i][j]=dp[i-1][j];
                if(j==target)
                    res=Math.max(res,dp[i][j]);
            }
        }
    }

    public static void main(String[] args) {
        int[] nums={7,9,3,8,0,2,4,8,3,9};
        dpTwoDArray(nums,2);

        int[] array =new int[]{1,2,5};
        canPartition(array);
    }
}
