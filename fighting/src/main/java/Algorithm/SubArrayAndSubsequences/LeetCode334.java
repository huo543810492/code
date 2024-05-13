package Algorithm.SubArrayAndSubsequences;

public class LeetCode334 {
    //n^2
    // public boolean increasingTriplet(int[] nums) {
    //     Map<Integer,Integer>map=new HashMap<>();
    //     for(int num:nums){
    //         int res=0;
    //         for(Map.Entry<Integer,Integer> entry:map.entrySet()){
    //             if(num>entry.getKey()){
    //                 res=Math.max(res,entry.getValue()+1);
    //             }
    //         }
    //         if(res==3)
    //             return true;
    //         map.put(num,res==0?1:res);
    //     }
    //     return false;
    // }

    //n
    public boolean increasingTriplet(int[] nums) {
        int[] minArray=new int[nums.length];
        minArray[0]=nums[0];
        for(int i=1;i<minArray.length;i++){
            minArray[i]=Math.min(minArray[i-1],nums[i]);
        }
        int max=nums[nums.length-1];
        for(int i=nums.length-2;i>=1;i--){
            max=Math.max(nums[i+1],max);
            if(minArray[i-1]<nums[i] && nums[i]<max)
                return true;
        }
        return false;
    }
}
