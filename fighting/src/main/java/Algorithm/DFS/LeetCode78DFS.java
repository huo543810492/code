package Algorithm.DFS;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LeetCode78DFS {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        dfs(0,result,nums,new Stack<Integer>());
        return result;
    }

    public static void dfs(int index, List<List<Integer>> result, int[] nums, Stack<Integer>temp) {
        result.add(new ArrayList<>(temp));//关键
        for(int i=index; i< nums.length; i++){
            temp.add(nums[i]);
            dfs(i+1,result,nums,temp);
            temp.remove(temp.size()-1);
        }
        return;//关键，利用i不能大于nums的length，配合return并回溯的，虽然有没有不影响程序运行，但是便于理解
    }

    public static void main(String[] args) {
        int[] test = {1,2,3};
        List<List<Integer>> ans = subsets(test);
        System.out.println(ans.toString());

    }
}
