package Algorithm.DivideAndConquer;


//
public class LeetCode53 { //divideAndConquer
    public static int maxSubArray(int[] nums) {

        return findMaxSubarray(nums,0,nums.length-1);
    }

    public static int findMaxSubarray(int[] nums, int left, int right){
        if (left > right)
            return Integer.MIN_VALUE; //防止捣乱
        if (left == right)
            return nums[left];
        int middle = (left + right) /2;
        int maxMiddleResult =  findMaxMiddleSubarray(nums,left,right);
        int maxLeftResult = findMaxSubarray(nums,left,middle-1);
        int maxRightResult = findMaxSubarray(nums,middle+1,right);
        return Math.max(maxMiddleResult,Math.max(maxLeftResult,maxRightResult));
    }

    public static int findMaxMiddleSubarray(int[] nums, int left, int right){
        int middle = (left + right) /2;
        int maxLeft = 0; //注意这里最后要返回maxLeft + nums[middle] + maxRight，可不敢写成integer的最小值哇，
        // 不想写成0是因为怕如果写0，数组全是负数，会影响结果，返回不存在的最大元素0，但是在下面会加上nums[middle]，所以不用担心
        //会返回nums[middle]
        int maxRight = 0;
        int curr =0;
        for(int i = middle - 1; i>=left; i--){
            curr += nums[i];
            maxLeft = Math.max(curr,maxLeft);
        }

        curr =0;
        for(int i = middle + 1; i<=right; i++){
            curr += nums[i];
            maxRight = Math.max(curr,maxRight);
        }
        return maxLeft + nums[middle] + maxRight;
    }

    public static void main(String[] args) {
        int [] array = {5,-2,1,-3,4,-2,1};
        int [] array2 = {-2,-1,-3,-4,-1,-2,-1,-5,-4};
        System.out.println(maxSubArray(array2));
    }

}
