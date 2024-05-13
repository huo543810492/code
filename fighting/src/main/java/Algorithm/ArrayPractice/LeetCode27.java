package Algorithm.ArrayPractice;

import java.util.Arrays;

public class LeetCode27 {
    public static void main(String[] args) {
        int[] a = new int[] {3,2,2,3};
        int[] b = new int[] {3,3};
        System.out.println(removeElement(b,3));
        System.out.println(Arrays.toString(b));
    }

    public static int removeElement(int[] nums, int val) {
        int length = nums.length;
        if(length == 0)
            return 0;
        int j = length-1;
        int i = 0;
        while(i<j){//i 是从左往右找等于val的值，找到就停下，所以，如果数组全是val的值，他就会等于零，等j来找他

            while (i<j && nums[i] != val)
            {
                i++;
            }
            while (i<j && nums[j] == val)
            {
                j--;
            }
            if (i<j){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }
        }
        if (nums[i] == val)  //第一次做的时候，上面双指针排序是能做出来的，就这里如何return值，一直想不明白
            //其实如果nums[i] == val，说明i右边的都是val，可以丢掉，所以return i，这里并不包括i自己本身，因为它也是val
            return i;

        else//一般这种情况是，i没有找到val，所以return i+1，它本身也不是val，要算在里面
            return i+1;
    }

    public int betterremoveElement(int[] nums, int val) {
        if(nums==null || nums.length==0)
            return 0;
        int index =0;

        for(int num:nums){
            if(num!=val){
                nums[index]=num;
                index++;
            }
        }
        return index;
    }
}
