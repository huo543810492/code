package Algorithm.BinarySearch;

public class test22
{
    public static void main(String[] args) {
        findPeakElement(new int[]{1,2,1,3,5,6,4});
    }

    public static int findPeakElement(int[] nums) {
        int left=0;
        int right=nums.length-1;
        while(left<right)
        {
            int index=(left+right)/2;
            if(index==nums.length-1)
                return index;
            if(nums[index]<nums[index+1])
                left=index+1;
            else
                right=index-1;
        }
        return left;
    }
}
