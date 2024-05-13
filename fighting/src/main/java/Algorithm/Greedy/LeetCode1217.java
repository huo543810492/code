package Algorithm.Greedy;

import java.util.HashMap;
import java.util.Map;

public class LeetCode1217 {
//    public int minCostToMoveChips(int[] position) {
//        HashMap<Integer,Integer> map = new HashMap<>();
//        int times=0;
//        int target=0;
//        int result=0;
//        for(int num:position){
//            if(map.get(num)==null)
//                map.put(num,1);
//            else
//                map.put(num,map.get(num)+1);
//        }
//        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
//            if(entry.getValue()>times){
//                times=entry.getValue();
//                target=entry.getKey();
//            }
//        }
//        for (int num : position){
//            if(num!=target){
//                int temp = Math.abs(num-target);
//                result=result+temp%2;
//            }
//        }
//        return result;
//    }
public int minCostToMoveChips(int[] position) {
    int even_cnt=0;
    int odd_cnt=0;
    for(int num:position){
        if(num%2==0)
            even_cnt++;
        else
            odd_cnt++;
    }
    return Math.min(even_cnt,odd_cnt);
}
}
