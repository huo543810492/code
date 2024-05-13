package Algorithm;

class test{
    public static void sortColors(int[] nums) {
        quickSort(nums,0,nums.length-1);
    }

    public static void quickSort(int[] nums, int left, int right)
    {
        if(left>=right)
            return;
        int i=left;
        int j=right;
        int target=nums[left];

        while(left<right)
        {
            while(left<right && nums[right]>=target)
                right--;

            while(left<right && nums[left]<=target)
                left++;

            swap(left,right,nums);
        }
        swap(i,left,nums);
        quickSort(nums,i,left-1);
        quickSort(nums,left+1,j);
    }

    public static void swap(int i,int j,int[] nums)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    public static void main(String[] args) {
        sortColors(new int[]{1,2,0,0});
    }
 }