package Algorithm.Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Arrays.sort(candidates);//排序为了后面的剪枝
        backTracking(res,candidates,target,0,new ArrayList<Integer>(),0);
        return res;
    }

    public void backTracking(List<List<Integer>> res, int[] candidates, int target, int index, List<Integer>temp,int sum)
    {
        if(sum==target)
        {
            res.add(new ArrayList(temp));
            return;
        }
        else if(sum>target)
            return;

        for(int i=index;i<candidates.length&&sum+candidates[i]<=target;i++) //剪枝
        {
            temp.add(candidates[i]);
            backTracking(res,candidates,target,i,temp,sum+candidates[i]);
            temp.remove(temp.size()-1);
        }
    }
}
