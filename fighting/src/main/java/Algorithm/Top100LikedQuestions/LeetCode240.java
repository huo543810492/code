package Algorithm.Top100LikedQuestions;

public class LeetCode240 {

    //n*logn
    // public boolean searchMatrix(int[][] matrix, int target) {
    //     boolean isVertical=matrix.length<matrix[0].length? true:false;//决定短边是哪里
    //     if(isVertical){//外层row,内层column
    //         for(int i=0;i<matrix.length;i++){
    //             int left=0,right=matrix[0].length-1;
    //             while(left<=right){
    //                 int index=(left+right)/2;
    //                 if(matrix[i][index]==target)
    //                     return true;
    //                 if(matrix[i][index]>target)
    //                     right=index-1;
    //                 else
    //                     left=index+1;
    //             }
    //         }
    //     }else{//外层column，内层row
    //         for(int i=0;i<matrix[0].length;i++){
    //             int left=0,right=matrix.length-1;
    //             while(left<=right){
    //                 int index=(left+right)/2;
    //                 if(matrix[index][i]==target)
    //                     return true;
    //                 if(matrix[index][i]>target)
    //                     right=index-1;
    //                 else
    //                     left=index+1;
    //             }
    //         }
    //     }
    //     return false;
    // }

    //m+n
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length-1,column=0;//左下角出发
        while(row>=0 && column<=matrix[0].length-1){
            if(matrix[row][column]==target)
                return true;
            if(matrix[row][column]>target)
                row--;
            else
                column++;
        }
        return false;
    }

}
