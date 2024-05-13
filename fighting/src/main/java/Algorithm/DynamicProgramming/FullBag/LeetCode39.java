package Algorithm.DynamicProgramming.FullBag;

import java.util.ArrayList;
import java.util.List;

public class LeetCode39 {
    public List<List<Integer>> dp(int[] candidates, int target)
    {
        List<List<Integer>>[] dp=new List[target+1];//关键
        for(int i=0;i<dp.length;i++)
            dp[i]=new ArrayList<>();
        dp[0].add(new ArrayList<>());
        for(int curr:candidates)
        {
            for(int j=curr;j<dp.length;j++)
            {
                for(List<Integer> list : dp[j-curr])
                {
                    List<Integer> temp=new ArrayList(list);
                    temp.add(curr);
                    dp[j].add(temp);//神了，这里想了好久
                }
            }
        }
        return dp[target];
    }
}
