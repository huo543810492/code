package Algorithm.Top100LikedQuestions;

public class LeetCode153 {
    public int findMin(int[] nums) {
        int left=0;
        int right=nums.length-1;
        if(nums[right]>nums[left] || nums.length==1)
            return nums[0];
        while(left<=right){
            int index=(left+right)/2;
            if(index>0 && nums[index]<nums[index-1]) //这个index大于0重要，//防止【2,1】
                return nums[index];
            else if(nums[index]>=nums[0])//等于号防止【2,1】
                left=index+1;
            else
                right=index-1;
        }
        return 0;
    }
}
