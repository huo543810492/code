package Algorithm.BinarySearch;

public class LeetCode162 {
    public int findPeakElement(int[] nums) {
        int l = 0;
        int r = nums.length-1;

        while(l<r){ //注意这里并不用等号，因为l=r代表以及找到最大值了，没必要再来一轮
            //而传统的二分，即使l=r也许并没有找到target，所以要再走一轮，因为最后返回index而不是left
            int index = l + (r-l)/2;
            if(nums[index]<nums[index+1])
                l=index+1;
            else
                r=index;//注意这里是index不是index-1
        }

        return l;//返回left而不是index,因为l=r代表以及找到最大值了
    }
}
