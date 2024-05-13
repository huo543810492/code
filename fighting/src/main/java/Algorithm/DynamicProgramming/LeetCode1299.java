package Algorithm.DynamicProgramming;

import java.util.Arrays;

public class LeetCode1299 {
    public int[] replaceElements(int[] arr) {
        int[] dp=new int[arr.length];
        Arrays.fill(dp,Integer.MIN_VALUE);
        dp[dp.length-1]=-1;
        for(int i=dp.length-2;i>=0;i--)
        {
            dp[i]=Math.max(dp[i+1],arr[i+1]);
        }
        return dp;
    }
}
