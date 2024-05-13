package Algorithm.Top100LikedQuestions;

public class LeetCode48 {
    //时间复杂度是M, M be the number of cells in the grid.
    public void rotate(int[][] matrix) {
        transpose(matrix);
        reverse(matrix);
    }

    private void transpose(int[][] matrix){
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<i;j++)//关键，只有对角线左边的用交换
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    private void reverse(int[][] matrix){
        for(int j=0;j<matrix.length/2;j++)
        {
            for(int i=0;i<matrix.length;i++)
            {
                int temp = matrix[i][j];
                matrix[i][j] =  matrix[i][matrix.length-j-1];//注意这里有个-1哈，(0,0)要变成(0,4)而不是(0,5),matrix.length是5
                matrix[i][matrix.length-j-1] = temp;
            }
        }
    }
}
