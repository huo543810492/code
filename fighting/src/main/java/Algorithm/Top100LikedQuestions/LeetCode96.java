package Algorithm.Top100LikedQuestions;

public class LeetCode96 {
    public int numTrees(int n) {
        int[] dp = new int[n+1];
        dp[0]=1;//注意这里是1
        dp[1]=1;
        for(int i=2;i<dp.length;i++)//不同长度的n
        {
            for(int root=1;root<=i;root++)//每次选不同的顶点,注意是从1开始
            {
                dp[i]=dp[i]+dp[root-1]*dp[i-root]; //等于加上左半段乘以右半段
            }
        }
        return dp[n];
    }
}
