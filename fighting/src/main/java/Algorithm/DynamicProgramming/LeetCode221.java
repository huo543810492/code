package Algorithm.DynamicProgramming;

public class LeetCode221 {
    public int maximalSquare(char[][] matrix) {
        int dp[][]=new int[matrix.length+1][matrix[0].length+1];
        int result=0;
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                if(matrix[i-1][j-1]=='1') //原数组的i-1 j-1 对应dp的i j
                {
                    dp[i][j]=Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]))+1; //是否有短板，短板值+1
                    result=Math.max(result,dp[i][j]);
                }

            }
        }
        return result*result;
    }
}
