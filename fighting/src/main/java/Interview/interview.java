package Interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class interview {

    public static int findUnsortedSubarray(int[] nums) {
        int start=-1,end=-2;
        int max=nums[0],min=nums[nums.length-1];
        for(int i=1;i<nums.length;i++){
            if(nums[i]<max)
                end=i;
            if(nums[nums.length-i]>min)
                start=nums.length-i;
            max=Math.max(nums[i],max);
            min=Math.min(nums[nums.length-i],min);
        }
        return end-start+1;
    }

    public static void main(String[] args) {
        System.out.println(findUnsortedSubarray(new int[]{2,1}));
    }
}
