package Algorithm.DynamicProgramming;

public class LeetCode1014 {
    //     public int maxScoreSightseeingPair(int[] values) {//my way,思路不是特别清晰
//         if(values.length==2)
//             return values[0]+values[1]-1;
//         int[] dp=new int[values.length];
//         int result=values[0]+values[1]-1;
//         dp[0]=values[0];
//         dp[1]=values[1];
//         for(int i=2;i<values.length;i++){
//             dp[i]=Math.max(Math.max(dp[i-2]-2,dp[i-1]-1),values[i-1]-1);
//             //自己琢磨的状态转移就两种情况，一种是这个点在i-1之前，那么就是Math.max(dp[i-2]-2,dp[i-1]-1)
// //要么就是这个最大点就是i-1  values[i-1]-1

//             result=Math.max(result,dp[i]+values[i]);
//         }
//         return result;
//     }

    public int maxScoreSightseeingPair(int[] values) {
        if(values.length==2)
            return values[0]+values[1]-1;
        int[] preMax=new int[values.length];
        int result=values[0]+values[1]-1;
        preMax[0]=values[0]+0;//a[i]=nums[i]+i

        for(int i=1;i<values.length;i++){
            preMax[i]=Math.max(preMax[i-1],values[i]+i);//有了这个前缀最大值，就可以转换成类似股票问题，求j-1天前的最大值,再加上values[j]-j,遍历，求这个能得到的最大值
        }

        for(int i=1;i<values.length;i++){//b[j]=nums[j]-j
            result=Math.max(result,values[i]+preMax[i-1]-i);
        }
        return result;
    }
}
