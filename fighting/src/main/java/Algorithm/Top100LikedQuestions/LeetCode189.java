package Algorithm.Top100LikedQuestions;

public class LeetCode189 {
    //extra space
    // public void rotate(int[] nums, int k)
    // {
    //     k=k%nums.length;
    //     int[] nums2=new int[nums.length];
    //     for(int i=0;i<nums.length;i++){
    //         int index=i+k>nums.length-1?(i+k)%nums.length:i+k;
    //         nums2[index]=nums[i];
    //     }
    //     for(int i=0;i<nums.length;i++)
    //         nums[i]=nums2[i];
    // }

    //Reverse
    //O(n),no extra space
    public void rotate(int[] nums, int k)
    {
        k=k%nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }

    public void reverse(int[] nums,int start,int end)
    {
        while(start<end)
        {
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}
