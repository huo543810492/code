package Algorithm.DynamicProgramming.FullBag;

public class LeetCode518 {

    // public int change(int amount, int[] coins) {
    //     int[] dp =new int[amount+1];
    //     dp[0]=1;
    //     for(int coin:coins){
    //         for(int i=coin;i<=amount;i++){
    //             dp[i]=dp[i]+dp[i-coin]; //注意这里是加法，而不是max，value是取得情况加不取的情况，因为取不取这个coin，都会大于等于dp[i-1][j]，因为之前没这个coin的时候，最多有几种方式，现在多个选择，方式肯定更多，且要加上dp[i-coin]
    //         }
    //     }
    //     return dp[amount];
    // }
    //再练一下二维数组，多学多练，我可以的
    public int change(int amount, int[] coins) {
        int[][] dp =new int[coins.length+1][amount+1];
        dp[0][0]=1;
        for(int i=1;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                if(j<coins[i-1])
                    dp[i][j]=dp[i-1][j];
                else
                    dp[i][j]=dp[i-1][j]+dp[i][j-coins[i-1]];
            }
        }
        return dp[coins.length][amount];
    }
}
