package Interview.interviewAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxContiguousSumNoLargerThanK {
    static List<List<Integer>> res = new ArrayList<>();
    public static long getMaxProfit(List<Integer> arr, int k) {
        if(arr==null || arr.size()==0){
            return 0;
        }
        int res=arr.get(0);
        for(int i=1;i<arr.size();i++){
            res=Math.max(slidingWindow(arr,i),res);
        }
        return res;
    }

    public static int slidingWindow(List<Integer> list, int size){
        int[] memo = new int[list.size()];
        int sum=0,count=0,left=0,res=0;
        for (int i=0;i<list.size();i++){
            sum+=list.get(i);
            count++;
            if(count>size){
                sum-=list.get(left);
                count--;
                left++;
            }
            res=Math.max(res,sum);
        }
        return res;
    }

    public static void main(String[] args) {
        //16
        System.out.println(getMaxProfit(Arrays.asList(8,2,5,-7,8,-6,4,1,-9,5),5));
    }
}
