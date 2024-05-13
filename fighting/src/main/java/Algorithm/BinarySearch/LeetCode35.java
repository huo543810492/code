package Algorithm.BinarySearch;

public class LeetCode35
{
    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length -1;
        int index = (nums.length -1)/2;
        while (left <= right){
            if(nums[index] == target)
                return index;
            if(nums[index] < target){
                left = index + 1;
                index = left + (right - left) /2;
            }
            else{
                right = index - 1;
                index = (right - left) /2 ;
            }
        }
        return left;
        //唯一区别是这里，返回即将插入的位置，如果left = right之后
        //最后nums[index] < target 说明要插入left + 1，这里left = index + 1了所以不用动
        //如果nums[index] > target 说明要插入left当前位置，而right位置会动，而left没变，就返回
        //left本身就好，真是巧妙
    }

    public static void main(String[] args) {
        int[] array = {3,4,5,6,7,8};
        int result = searchInsert(array,6);
    }
}
