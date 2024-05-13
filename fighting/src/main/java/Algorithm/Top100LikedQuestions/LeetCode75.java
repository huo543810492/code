package Algorithm.Top100LikedQuestions;

public class LeetCode75 {
    public void sortColors(int[] nums) {
        int left=0;
        int right=nums.length-1;
        doSortColors(nums,left,right);
    }
    private void doSortColors(int[] nums,int left,int right)
    {
        if(left>=right)
            return;
        int i = left;
        int j = right;
        int target = nums[i];
        while(i<j)
        {
            while(nums[j]>=target && i<j)
                j--;
            while(nums[i]<=target && i<j)
                i++;
            swap(nums,j,i);
        }
        swap(nums,left,i);
        doSortColors(nums,left,i-1);
        doSortColors(nums,i+1,right);
    }
    private void swap(int[] nums,int a, int b)
    {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
