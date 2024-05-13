package Algorithm.ArrayPractice;

public class LeetCode485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int result = 0;
        int finalResult = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == 1){
                result++;
                if(result > finalResult){
                    finalResult = result;
                }
            }
            else{
                result = 0;
            }
        }
        return finalResult;
    }
}
