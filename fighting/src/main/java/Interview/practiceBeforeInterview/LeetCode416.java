package Interview.practiceBeforeInterview;

import java.util.Arrays;

public class LeetCode416 {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
        if(sum%2!=0){
            return false;
        }
        int target=sum/2;
        Boolean[] dp=new Boolean[target+1];
        Arrays.fill(dp,false);
        dp[0]=true;
        for(int num:nums){
            for(int j=dp.length-1;j>1;j--){
                if(j>=num){
                    dp[j]=dp[j-num]||dp[j];
                }
            }
        }
        return dp[target];
    }

    static class Test{
        public static void main(String[] args) {
            LeetCode416 leetCode416 = new LeetCode416();
            leetCode416.canPartition(new int[]{1,1});
        }
    }

}
