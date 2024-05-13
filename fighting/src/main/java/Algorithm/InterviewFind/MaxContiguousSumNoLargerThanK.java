package Algorithm.InterviewFind;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxContiguousSumNoLargerThanK {
    static List<List<Integer>> res = new ArrayList<>();
    public static long getMaxProfit(List<Integer> pnl, int k) {
        // Write your code here
        int[] memo = new int[k+1];//store prefix sum
        if(pnl.size()==0)
        {
            return 0;
        }
        int res=pnl.get(0);
        for(int i=1;i<=k;i++)
        {
            res = Math.max(slidingWindow(pnl,i, memo),res);
        }
        return res;
    }

    public static int slidingWindow(List<Integer> list, int size, int[] memo){
        int res=list.get(0);
        int sum=0;
        int left=0;
        for(int i=size-1;i<list.size();i++)
        {
            if(i<size){
                sum=memo[size-1]+list.get(i);
                memo[size]=sum;
            }
            else if(i==size){
                res=sum;
            }
            else if(i>size){
                sum-=list.get(left);
                sum+=list.get(i);
                left++;
                res=Math.max(res,sum);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(getMaxProfit(Arrays.asList(8,2,5,-7,8,-6,4,1,-9,5),5));
    }
}
