package Algorithm.DynamicProgramming.BagFor01;

import java.util.Arrays;

public  class LeetCode494 {
    int result=0;
    public int findTargetSumWays(int[] nums, int target) {
        target=Math.abs(target);
        int sum=0;
        for(int num:nums)
            sum +=num;
        if(target>sum || (sum+target)%2 !=0)
            return 0;
        int sumTarget=(sum+target)/2;//变成0 1背包找和为sumTarget的最多方法

        //1D array
        int[] dp=new int[sumTarget+1];
        dp[0]=1;
        for(int curr:nums)
        {
            for(int j=sumTarget;j>=curr;j--){
                dp[j]=dp[j]+dp[j-curr];
            }
        }
        return dp[sumTarget];

        //2D array
//         int dp[][] = new int[nums.length+1][sumTarget+1];
//         dp[0][0]=1;
//         for(int i=1;i<dp.length;i++){
//             for(int j=0;j<dp[0].length;j++){
//                 if(nums[i-1]>j)
//                     dp[i][j]=dp[i-1][j];
//                 else
//                     dp[i][j]=dp[i-1][j] + dp[i-1][j-nums[i-1]];
//                 if(j==dp[0].length-1)
//                     result=Math.max(result,dp[i][j]);
//             }
//         }

//         return result;

        //暴力破解法
        // return calculateBruteForce(nums,0,0,target);

    }

    public int calculateBruteForce(int[] nums,int index,int sum,int target){
        if(index==nums.length){
            if(sum==target)
                result++;
        }

        else{
            calculateBruteForce(nums,index+1,sum+nums[index],target);
            calculateBruteForce(nums,index+1,sum-nums[index],target);
        }
        return result;
    }

//    public static void main(String[] args) {
//        int[] array ={1,1,1,1,1};
//        findTargetSumWays(array,3);
//    }
}
