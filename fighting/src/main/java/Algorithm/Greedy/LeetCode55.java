package Algorithm.Greedy;

public class LeetCode55 {

    //greedy
    public boolean canJump(int[] nums) {
        int lastPosition=nums.length-1;//用于判断是否能从数组的末尾开始，沿着最优解，达到index0
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]+i>=lastPosition) //为什么要nums[i]+i,为了检查当前i的位置是否能够到lastPosition，
                //如果可以够到，更新lastPosition为i，新的目标就是看在到index0之前，可不可以够到lastPosition
                lastPosition=i;
        }
        return lastPosition==0;
    }


//    //backTracking
//    public static boolean canJumpBackTracking(int[] nums){
//        if(nums.length==1)
//            return true;
//        return jumpFromPosition(nums,0,nums[0]);
//
//    }
//
//    public static boolean jumpFromPosition(int[] nums,int index,int step)
//    {
//        if(index+step>=nums.length-1)
//            return true;
//        for(int i=step;i>0;i--) //注意等于0的话，会引起死循环
//        {
//            if(jumpFromPosition(nums,index+step,nums[index+step]))
//                return true;
//        }
//        return false;
//    }


    //dp
    enum Index{
        GOOD,BAD,UNKNOWN
    }

    public static boolean canJumpDp(int[] nums){
        if(nums.length==1)
            return true;
        Index[] memo=new Index[nums.length];
        for(int i=0;i<memo.length-1;i++)
        {
            memo[i]=Index.UNKNOWN;
        }
        memo[nums.length-1]=Index.GOOD;
        return jumpFromPosition(nums,0,nums[0],memo);
    }

    public static boolean jumpFromPosition(int[] nums,int index,int step,Index[] memo)
    {
        if(memo[index]==Index.GOOD)
            return true;
        else if(memo[index]==Index.BAD)
            return false;
        for(int i=index+step;i>index;i--)
        {
            int furthestJump=Math.min(i,nums.length-1);
            if(jumpFromPosition(nums,furthestJump,nums[furthestJump],memo))
            {
                memo[index]=Index.GOOD;//这行有没有差不多，以为在初始的情况下，只有最后一位是good，只要能达到它的位置，那答案就是true，直接返回就行了，不用标记
                return true;
            }
        }
        memo[index]=Index.BAD;
        return false;
    }

    public static void main(String[] args) {
        int[] array ={5,4,3,2,1,0,3};
        canJumpDp(array);
    }
}
