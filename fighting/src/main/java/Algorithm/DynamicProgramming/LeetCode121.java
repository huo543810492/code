package Algorithm.DynamicProgramming;

import java.util.Arrays;

public class LeetCode121 {
    public int maxProfit(int[] prices) {
        // return onePass(prices);
        return dpSolution(prices);
    }

    public int onePass(int[] prices){
        int profit=0;
        int min=Integer.MAX_VALUE;

        for(int i:prices){
            if(i<min)
                min=i;
            else{
                profit=Math.max(profit,i-min);
            }
        }

        return profit;
    }

    public int dpSolution(int[] prices){
        int result=0;
        int[] dp =new int[prices.length];
        dp[0]=prices[0];//index天能买到的最便宜的股票价钱
        for(int i=1;i<prices.length;i++){
            dp[i]=Math.min(prices[i],dp[i-1]);//注意这里是比较i-1天的最小值，和i当天的最小值，其中小的为i天的最小值，放dp[i]里面
            result=Math.max(prices[i]-dp[i-1],result);//第i天能买到的最便宜的股票是i-1天之前的最小值,注意是i-1不是i
        }

        return result;
    }
}
