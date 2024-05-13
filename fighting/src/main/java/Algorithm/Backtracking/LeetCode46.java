package Algorithm.Backtracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeetCode46 {
    public List<List<Integer>> permute(int[] nums) {
        List <List<Integer>> result = new ArrayList<>();
        if(nums == null || nums.length ==0)
            return result;
        List<Integer> temp = new ArrayList<>();
        for(int num : nums)
            temp.add(num);
        backTracking(0,temp,nums.length,result);
        return result;
    }

    public void backTracking (int index, List<Integer> nums, int length, List <List<Integer>> result){
        if((length-1)== index)
        {
            result.add(new ArrayList<>(nums));
            return;
        }
        //首先这道题，不用temp.add，因为要产生的数组的长度和传入的数组长度相等，所以只要swap就行
        for(int i = index;i<nums.size();i++){//虽然每次要交换，但是也要保留原有的顺序，比如123，这种就通过swap【1,1】 swap2,2得到的
            Collections.swap(nums,i,index);//注意这个是Collections的方法，接受list不接受数组，所以数组要在传进来前就做转换成list
            backTracking(index+1,nums,length,result);  //这里传的是index+1，index可以考虑为数组下标长度，每次让index后面的数和他交换
            Collections.swap(nums,i,index);//每次做完再回溯
        }
    }
}
