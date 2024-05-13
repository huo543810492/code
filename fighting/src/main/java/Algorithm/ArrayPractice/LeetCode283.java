package Algorithm.ArrayPractice;

import java.util.Arrays;

public class LeetCode283 { //第一次没做出来，思路不对，想的太复杂了
    public static void main(String[] args) {
        int[] a = {0,1,0,3,12};
        moveZeroes(a);
        System.out.println(Arrays.toString(a));
    }
    public static void moveZeroes(int[] nums) {
        if(nums==null || nums.length==1)
            return;
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0)
            {
                int temp=nums[i];
                nums[i]=0;
                nums[j]=temp;
                j++;
            }
        }
    }
}
