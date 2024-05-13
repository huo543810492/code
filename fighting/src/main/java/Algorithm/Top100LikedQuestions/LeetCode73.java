package Algorithm.Top100LikedQuestions;

public class LeetCode73 {
    //容易想出来的方案，Space Complexity: O(M + N)
//     public void setZeroes(int[][] matrix) {
//         List<Integer>list = new ArrayList();
//         for(int i=0;i<matrix.length;i++)
//         {
//             for(int j=0;j<matrix[0].length;j++)
//             {
//                 if(matrix[i][j]==0)
//                     list.add(i*matrix[0].length+j);
//             }
//         }
//         for(int num:list)
//         {
//             setZero(matrix,num/matrix[0].length,num%matrix[0].length);
//         }
//     }

//     private void setZero(int[][] matrix,int row,int column)
//     {
//         for(int i=0;i<matrix.length;i++)
//             matrix[i][column]=0;
//         for(int j=0;j<matrix[0].length;j++)
//             matrix[row][j]=0;
//         return;
//     }

    //Space Complexity: O(1)的方案，
    public void setZeroes(int[][] matrix) {
        boolean isCol=false;
        boolean isRow=false;
        for(int i=0;i<matrix.length;i++)
        {
            if(matrix[i][0]==0)
                isCol=true;
        }
        for(int j=0;j<matrix[0].length;j++)
        {
            if(matrix[0][j]==0)
                isRow=true;
        }
        for(int i=1;i<matrix.length;i++)
        {
            for(int j=1;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==0)
                {
                    matrix[0][j]=0;
                    matrix[i][0]=0;
                }
            }
        }

        for(int i=1;i<matrix.length;i++) //注意第二次的遍历方式
        {
            for(int j=1;j<matrix[0].length;j++)
            {
                if(matrix[0][j]==0 || matrix[i][0]==0)  //注意这里是或
                {
                    matrix[i][j]=0;
                }
            }
        }
        if(isRow)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                matrix[0][j]=0;
            }
        }

        if(isCol)
        {
            for(int i=0;i<matrix.length;i++)
            {
                matrix[i][0]=0;
            }
        }
    }
}
