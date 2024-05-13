package Algorithm.Top100LikedQuestions;

public class LeetCode31 {
    class Solution {
        public void nextPermutation(int[] nums) {
            int i=nums.length-1;
            while(i>=1 && nums[i-1]>=nums[i]) //虽然一直说递增递增，等号也是要有的，大于等于就往前走,用于[5,1,1]这种情况
                i--;

            if(i>0) //发现不递增的位置，i=0的话是一直从后往前在递增
            {
                int j=nums.length-1;
                //找到一个大于i-1位置的数，两个数交换
                while(nums[i-1]>=nums[j]&&j>0)//注意到i为止一直在增的，i-1才是没增的位置,所以下面用到i的时候，都是i-1而不是i
                    j--;
                swap(nums,i-1,j);
                reverse(nums,i-1);
            }
            else //一直递增，用于3 2 1情况i=0
                reverse(nums,i-1);
        }

        private void swap(int[] nums,int i, int j)
        {
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }

        private void reverse(int[] nums,int i)
        {
            int right=nums.length-1;
            int left=i+1;//不过reverse，执行的是i-1后面的值，也就是从i开始
            while(left<right)
            {
                swap(nums,left,right);
                left++;
                right--;
            }
        }
    }
}
