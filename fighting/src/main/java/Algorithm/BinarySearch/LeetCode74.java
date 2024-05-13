package Algorithm.BinarySearch;

public class LeetCode74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        int left = 0;
        int right = row*col-1;
        while(left<=right)
        {
            int index = (left+right)/2;
            int indexValue = matrix[index/col][index%col];
            if(target==indexValue)
                return true;
            else if(target>indexValue)
                left=index+1;
            else
                right=index-1;
        }
        return false;
    }
}
