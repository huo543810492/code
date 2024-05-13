package Algorithm.SubArrayAndSubsequences;

public class LeetCode560 {
    //n
    // public int subarraySum(int[] nums, int k) {
    //     if(nums==null || nums.length==0)
    //         return 0;
    //     int res=0;
    //     Map<Integer,Integer> sumStartOccurrencesMap = new HashMap<>();
    //     int sumEnd=0;
    //     sumStartOccurrencesMap.put(0,1);
    //     for(int num:nums){
    //         sumEnd+=num;
    //         if(sumStartOccurrencesMap.containsKey(sumEnd-k)) //注意这里是sumEnd-k而不是k-sumEnd, sumEnd-sumStart=k
    //             res+=sumStartOccurrencesMap.get(sumEnd-k);
    //         sumStartOccurrencesMap.put(sumEnd, sumStartOccurrencesMap.getOrDefault(sumEnd,0)+1);
    //     }
    //     return res;
    // }

    //n^2
    public int subarraySum(int[] nums, int k) {
        if(nums==null || nums.length==0)
            return 0;
        int res=0;
        int[] sum=new int[nums.length+1];
        for(int i=1;i<sum.length;i++){
            sum[i]=sum[i-1]+nums[i-1];
        }
        for(int start=0;start<sum.length;start++){
            for(int end=start+1;end<sum.length;end++){
                if(sum[end]-sum[start]==k)
                    res++;
            }
        }
        return res;
    }
}
