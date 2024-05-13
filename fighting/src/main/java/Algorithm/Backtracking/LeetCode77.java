package Algorithm.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class LeetCode77 {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res =new ArrayList<>();
        backTracking (res,n,k,new ArrayList<Integer>(),1);
        return res;
    }

    public void backTracking(List<List<Integer>> res,int n,int k,List<Integer> temp, int index)
    {
        if(temp.size()==k){
            res.add(new ArrayList(temp));
            return;
        }

        for(int i=index;i<=(n-(k-temp.size())+1);i++){ //cut
            temp.add(i);
            backTracking(res,n,k,temp,i+1);
            temp.remove(temp.size()-1);
        }
    }
}
