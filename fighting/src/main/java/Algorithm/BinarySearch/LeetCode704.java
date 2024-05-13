package Algorithm.BinarySearch;

public class LeetCode704 {
    public int search(int[] nums, int target) {
        int index = 0;
        int left = 0;
        int right = nums.length - 1;

        while(left <= right){
            index = left + (right - left) /2;
            if (nums[index] == target)
                return index;
            if(nums[index] < target)
                left = index +1;
            else
                right = index - 1;
        }
        return -1;
    }
}
