package Algorithm.SubArrayAndSubsequences;

public class LeetCode581 {
    public int findUnsortedSubarray(int[] nums) {
        Integer end=-2,start=-1,max=nums[0],min=nums[nums.length-1];
        for(int i=1;i<nums.length;i++){
            if(nums[i]<max)
                end=i;
            if(nums[nums.length-i-1]>min)
                start=nums.length-i-1;
            max=Math.max(max,nums[i]);
            min=Math.min(min,nums[nums.length-i-1]);
        }
        return end-start+1;
    }
}
