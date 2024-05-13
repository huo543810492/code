package Algorithm.BinarySearch;

public class WrongBinarySearch {
    public static int search(int[] nums, int target) {
        int index = nums.length/2;

        if(nums == null || nums.length == 0)
            return -1;

        if(index == 0)
        {
            index = nums[0] == target? 0: -1;
            return index;
        }

        while(index>=0 && index<=nums.length)
        {
            if(index == nums.length || index == 0)
            {
                index = nums[index] == target? index : -1 ;
                return index;
            }


            if((nums[index] < target && nums[index+1]>target) || (nums[index] > target && nums[index-1]<target))
                return -1;

            if(nums[index] == target)
                return index;

            if(nums[index]>target){
                index = index/2==0? index-1 : index/2;
            }

            else{
                index = (nums.length-index)/2==0? index+1 : ((nums.length-index)/2 + index);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arry = {-1,0,3,5,9,12};
        System.out.println(search(arry,3));
    }
}
