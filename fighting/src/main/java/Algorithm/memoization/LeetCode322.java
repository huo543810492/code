package Algorithm.memoization;

import java.util.Arrays;

public class LeetCode322 {
    public int coinsChange(int amount, int[] coins){
        Arrays.sort(coins);
        int[] dp=new int[amount+1];
        dp[0]=0;
        for(int i=1;i<=amount;i++){
            int minNum=Integer.MAX_VALUE;
            for (int j = 0; j <coins.length ; j++) {
                int remainAmount=dp[i]-coins[j];
                if(remainAmount<0)
                    break;
                if(dp[remainAmount]!=Integer.MAX_VALUE){
                    minNum=Math.min(minNum,dp[remainAmount]+1);
                }
            }
        }
        return dp[amount]==Integer.MAX_VALUE? -1:dp[amount];
    }
}
