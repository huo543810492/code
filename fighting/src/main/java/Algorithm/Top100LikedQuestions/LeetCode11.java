package Algorithm.Top100LikedQuestions;

public class LeetCode11 {
    //brute force
    // public int maxArea(int[] height) {
    //     if(height==null || height.length==0)
    //         return 0;
    //     int res=0;
    //     int min=0;
    //     for(int i=0;i<height.length;i++)
    //     {
    //         for(int j=i+1;j<height.length;j++)
    //         {
    //             min=Math.min(height[i],height[j]);
    //             int temp=min*(j-i);
    //             res=Math.max(res,temp);
    //         }
    //     }
    //     return res;
    // }

    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int res=0;
        while(left<right)
        {
            int area=Math.min(height[left],height[right])*(right-left);
            res=Math.max(area,res);
            if(height[left]>height[right])
                right--;
            else
                left++;
        }
        return res;
    }
}
