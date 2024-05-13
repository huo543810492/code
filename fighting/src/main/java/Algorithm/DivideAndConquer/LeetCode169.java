package Algorithm.DivideAndConquer;

public class LeetCode169 {
    public int majorityElement(int[] nums) {
        return findMajorityElement(nums,0,nums.length-1);
    }
    public int findMajorityElement(int[] nums, int left, int right){
        if(left == right)
            return nums[left];
        int middle = left + (right - left)/2;
        int leftMajorityElement = findMajorityElement(nums,left,middle);
        int rightMajorityElement = findMajorityElement(nums,middle+1,right);
        if(leftMajorityElement == rightMajorityElement)
            return leftMajorityElement;
        else
        {
            int leftCount =0;
            int rightCount =0;
            for(int i=left;i<=right;i++){
                if(nums[i] == leftMajorityElement)
                    leftCount++;
                if(nums[i] == rightMajorityElement)
                    rightCount++;
            }
            return (leftCount>rightCount)? leftMajorityElement:rightMajorityElement;
        }

    }
}
