package Algorithm.Top100LikedQuestions;

public class LeetCode238 {
    // Time complexity O(n)  space complexity O(n)
//     public int[] productExceptSelf(int[] nums) {
//         int[] prefix=new int[nums.length];
//         int[] suffix=new int[nums.length];
//         int[] res=new int[nums.length];

//         prefix[0]=1;
//         suffix[suffix.length-1]=1;
//         for(int i=1;i<prefix.length;i++){
//             prefix[i]=prefix[i-1]*nums[i-1];
//         }

//         for(int i=nums.length-2;i>=0;i--){
//             suffix[i]=suffix[i+1]*nums[i+1];
//         }

//         for(int i=0;i<res.length;i++){
//             res[i]=prefix[i]*suffix[i];
//         }
//         return res;
//     }

    // Time complexity O(n)  space complexity O(1) 不算return的array情况下
    public int[] productExceptSelf(int[] nums) {
        int[] res=new int[nums.length];
        int suffix=nums[nums.length-1];
        res[0]=1;
        for(int i=1;i<res.length;i++){
            res[i]=res[i-1]*nums[i-1];
        }

        for(int i=nums.length-2;i>=0;i--){
            res[i]=res[i]*suffix;
            suffix=suffix*nums[i]; //注意这里的nums[i] 不是i+1，因为当下次遍历i 会减1，所以对于下轮来说，已经是i+1了
        }

        return res;
    }
}
