package Algorithm.Top100LikedQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCode347 {

    //hashmap加上priorityQueue, Time Complexity O(nlogk)  space Complexity O(n)
//    public int[] topKFrequent(int[] nums, int k) {
//        Map<Integer,Integer> map=new HashMap<>();
//        PriorityQueue<Map.Entry<Integer,Integer>> maxHeap=new PriorityQueue<>(
//                (a,b)->b.getValue()-a.getValue());
//        for(int num:nums){
//            map.put(num,map.getOrDefault(num,0)+1);
//        }
//        //这里时间复杂度是Nlogk,因为heap只存k个元素,O(N log k) < O(N log N) time
//        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
//            maxHeap.add(entry);//添加k的元素到heap里面，时间复杂度是logk
//            if(maxHeap.size()>k)//这一步的作用是让maxHeap存更少的元素，这样里面存的元素是k,k是小于n的
//                maxHeap.poll();
//        }
//        int[] res=new int[k];
//        //这里时间复杂度是klogk
//        for(int i=0;i<k;i++){
//            res[i]=maxHeap.poll().getKey();
//        }
//        return res;
//    }



    //O(n) Solution - Bucket Sort
    // TC: O(n), SC: O(n)
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer> res=new ArrayList();
        Map<Integer,Integer> map=new HashMap<>();
        List<Integer>[] bucket=new List[nums.length+1];
        for(int num:nums)
            map.put(num,map.getOrDefault(num,0)+1);
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(bucket[entry.getValue()]==null)
                bucket[entry.getValue()]=new ArrayList();
            bucket[entry.getValue()].add(entry.getKey());
        }

        for(int i=bucket.length-1;i>=0 && res.size()<k;i--){
            if(bucket[i]!=null)
                res.addAll(bucket[i]);
        }
        res=res.subList(0,k);//防止超了的情况
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}
