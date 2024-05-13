package Algorithm.Top100LikedQuestions;

public class LeetCode34 {
    public int[] searchRange(int[] nums, int target) {
        int left=searchLeft(nums,target);
        int right=searchRight(nums,target);
        return new int[]{left,right};
    }

    public int searchLeft(int[] nums,int target)
    {
        int left=0;
        int right=nums.length-1;
        int leftMostResult=-1;
        while(left<=right)
        {
            int index=(left+right)/2;
            if(nums[index]==target)
            {
                leftMostResult=index;
                right=index-1; //try if there still have any candidate on left side
            }
            else if(nums[index]>target)
                right=index-1;
            else
                left=index+1;
        }
        return leftMostResult;
    }

    public int searchRight(int[] nums,int target)
    {
        int left=0;
        int right=nums.length-1;
        int rightMostResult=-1;
        while(left<=right)
        {
            int index=(left+right)/2;
            if(nums[index]==target)
            {
                rightMostResult=index;
                left=index+1; //try if there still have any candidate on right side
            }
            else if(nums[index]>target)
                right=index-1;
            else
                left=index+1;
        }
        return rightMostResult;
    }
}
