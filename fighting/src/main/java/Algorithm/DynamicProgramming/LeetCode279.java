package Algorithm.DynamicProgramming;

import java.util.ArrayList;
import java.util.List;

public class LeetCode279 {
    public int numSquares(int n) {
        List<Integer> coins=generatePerfectSquares(n);
        int res=coinChange(coins,n);
        return res;
    }

    public int coinChange(List<Integer> coins,int n)
    {
        int[] dp=new int[n+1];
        for(int currAmount=1;currAmount<dp.length;currAmount++)
        {
            int minNum=n+1;
            for(int coin:coins)
            {
                if(currAmount<coin)
                    break;
                else
                    minNum=Math.min(dp[currAmount-coin]+1,minNum);
            }
            dp[currAmount]=minNum;
        }
        return dp[n];
    }

    public List<Integer> generatePerfectSquares(int n){
        List<Integer> res=new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            res.add(i*i);
        }
        return res;
    }

//    public static void main(String[] args) {
//        System.out.println(numSquares(43));
//    }
}
