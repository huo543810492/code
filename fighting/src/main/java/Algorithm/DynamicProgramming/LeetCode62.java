package Algorithm.DynamicProgramming;

public class LeetCode62 {
    public int uniquePaths(int m, int n) {
        //方程式：grid[m][n]=grid[m-1][n]+grid[m][n-1]
        int[][] array=new int[m][n];

        for(int i=0;i<m;i++){//先填充二维数组，row 0 或者 col 0
            array[i][0]=1;
        }
        for(int j=0;j<n;j++){//先填充二维数组，row 0 或者 col 0
            array[0][j]=1;
        }

        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                array[i][j]=array[i-1][j] + array[i][j-1];
            }
        }
        return array[m-1][n-1];
    }
}
