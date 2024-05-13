package Algorithm.SubArrayAndSubsequences;

public class LeetCode152 {
    public int maxProduct(int[] nums) {
        int res=nums[0];
        int max=res,min=res;
        for(int i=1;i<nums.length;i++)
        {
            int tempMax=max;
            max=Math.max(Math.max(nums[i]*max,nums[i]),nums[i]*min);
            min=Math.min(Math.min(nums[i]*min,nums[i]),nums[i]*tempMax);//注意这里是tempMax不是max，不然同一个nums[i]用了两遍
            res=Math.max(res,max);
        }
        return res;
    }
}
