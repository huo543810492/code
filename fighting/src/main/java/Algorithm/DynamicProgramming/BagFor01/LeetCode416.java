package Algorithm.DynamicProgramming.BagFor01;

public class LeetCode416 {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int num:nums)
            sum+=num;
        if(sum%2!=0)
            return false;
        int subSum=sum/2;
        //2-D array
//         boolean [][] dp= new boolean[nums.length+1][subSum+1];
//         dp[0][0]=true;
//         for(int i=1;i<dp[0].length;i++){  //把i=0情况先初始化掉
//             dp[0][i]=false;
//         }

        // for(int i=1;i<dp.length;i++){
        //     for(int j=0;j<dp[0].length;j++){
        //         int curr=nums[i-1];
        //         if(curr>j) //考虑curr可能大于j，就像找零中，零钱大于amount一样
        //             dp[i][j]=dp[i-1][j];
        //         else
        //             dp[i][j]=dp[i-1][j] || dp[i-1][j-curr];
        //         if(j==dp[0].length-1 && dp[i][j]==true)
        //             return true;
        //     }
        // }
        // return false;

        //1-D array
        boolean[] dp=new boolean[subSum+1];
        dp[0]=true;
        for(int curr:nums){
            for(int j=subSum;j>=curr;j--){//为什么要>=curr,因为滚动数组，前面的值已经是上一行的数了
                dp[j]=dp[j] || dp[j-curr];   //第一个dp[j]是i行的，后面两个都是i-1行的
            }
        }
        return dp[subSum];
    }
}
