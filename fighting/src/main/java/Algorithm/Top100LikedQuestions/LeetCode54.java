package Algorithm.Top100LikedQuestions;

import java.util.ArrayList;
import java.util.List;

public class LeetCode54 {
    int left,top,right,bottom;
    public List<Integer> spiralOrder(int[][] matrix) {
        left=0;
        top=0;
        right=matrix[0].length-1;
        bottom=matrix.length-1;
        int i=0;
        List<Integer> list=new ArrayList();
        while(left<=right && top<=bottom) //有等于号的,想一下如果想拿到Example1里的4或者5，这里和下面的等于号都是有必要的
        {
            if(i%4==0)//这里i++要放在最下面而不是if里面，原因是，如果放在最下面，每次i++都会做上面while里面的判断，若放if里面则不会做判断
            {
                moveRight(list,matrix);
            }

            if(i%4==1)
            {
                moveDown(list,matrix);
            }

            if(i%4==2)
            {
                moveLeft(list,matrix);
            }

            if(i%4==3)
            {
                moveUp(list,matrix);
            }
            i++;
        }
        return list;
    }

    public void moveRight(List<Integer> list, int[][] matrix)
    {
        for(int j=left;j<=right;j++)
        {
            list.add(matrix[top][j]);
        }
        top++;
    }

    public void moveDown(List<Integer> list, int[][] matrix)
    {
        for(int j=top;j<=bottom;j++)
        {
            list.add(matrix[j][right]);
        }
        right--;
    }

    public void moveLeft(List<Integer> list, int[][] matrix)
    {
        for(int j=right;j>=left;j--)
        {
            list.add(matrix[bottom][j]);
        }
        bottom--;
    }

    public void moveUp(List<Integer> list, int[][] matrix)
    {
        for(int j=bottom;j>=top;j--)
        {
            list.add(matrix[j][left]);
        }
        left++;
    }
}
