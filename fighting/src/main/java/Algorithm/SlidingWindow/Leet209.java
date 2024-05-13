package Algorithm.SlidingWindow;

public class Leet209 {
    public int minSubArrayLen(int target, int[] nums) {
        int result = nums.length+1;
        int sum =0;
        int left =0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            while(sum>=target){//有等号的
                result = Math.min((i+1-left),result);
                sum-=nums[left];
                left++;
            }
        }

        return (result==nums.length+1)?0:result;
    }
}
