package Algorithm.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class LeetCode78 {
    public static List<List<Integer>> subsets(int[] nums) {
        int length = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        for (int subsetLength=0; subsetLength<length+1; subsetLength++){
            backTrack(0,subsetLength,nums,result,temp);
        }
        System.out.println(result);
        return result;

    }

    public static void backTrack(int index,int subsetLength,int[] nums,List<List<Integer>> result,List<Integer> temp){
        if(temp.size() == subsetLength)
        {
            result.add(new ArrayList(temp));//注意引用问题
            return;
        }


        for(int i=index;i<(nums.length-(subsetLength-temp.size())+1);i++){//cut
            System.out.println("subsetLength  is" + subsetLength);
            System.out.println("index  is"  + index);
            System.out.println("i  is"  + i);

            temp.add(nums[i]);
            backTrack(i+1,subsetLength,nums,result,temp); //index 和 i 有点混，区别是如果这里是i+1,i循环起来后，i会变得更大
            temp.remove(temp.size()-1);//关键
        }
    }

    public static void main(String[] args) {
        int[] test = {1,2,3};
        subsets(test);
    }
}
