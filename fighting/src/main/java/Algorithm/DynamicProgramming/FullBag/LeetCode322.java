package Algorithm.DynamicProgramming.FullBag;

import java.util.Arrays;

public class LeetCode322 {
    //full-bag
    //利用滚动数组的思想把二维数组压缩成一维数组
    //     public int coinChange(int[] coins, int amount) {
    //         int[] dp=new int[amount+1];
    //         Arrays.fill(dp,amount+1);
    //         dp[0]=0;
    //         for(int coin:coins)//先遍历物品
    //         {
    //             for(int currAmount=coin;currAmount<=amount;currAmount++){//完全背包，从前往后遍历j
    //                 dp[currAmount]=Math.min(dp[currAmount],dp[currAmount-coin]+1);
    //             }
    //         }
    //         return dp[amount]>amount?-1:dp[amount];
    // }

    //2维数组
    public int coinChange(int[] coins, int amount) {
        if(amount==0)
            return 0;
        int res=amount+1;
        int[][] dp=new int[coins.length+1][amount+1];
        for(int j=1;j<dp[0].length;j++)
            dp[0][j]=amount+1;
        for(int i=1;i<dp.length;i++)
        {
            int curr=coins[i-1];
            for(int j=1;j<dp[0].length;j++)
            {
                if(j>=curr)
                    dp[i][j]=Math.min(dp[i-1][j],dp[i][j-curr]+1);
                else
                    dp[i][j]=dp[i-1][j];
                if(j==amount)
                    res=Math.min(res,dp[i][j]);
            }
        }
        return res>amount? -1:res;
    }
}
