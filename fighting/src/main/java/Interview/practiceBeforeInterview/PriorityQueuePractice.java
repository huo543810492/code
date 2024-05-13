package Interview.practiceBeforeInterview;

import java.util.*;

public class PriorityQueuePractice {
    public List<String> topKFrequent(String[] words, int k) {
        List<String> result = new ArrayList<>();
        Map<String,Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            map.put(words[i],map.getOrDefault(words[i],0)+1);
        }
        PriorityQueue<Map.Entry<String,Integer>> minHeap=new PriorityQueue<>(
                (a,b) -> a.getValue()==b.getValue()?b.getKey().compareTo(a.getKey()):a.getValue()-b.getValue()
        );
        for (Map.Entry<String,Integer> entry:map.entrySet()){
            minHeap.add(entry);
            if(minHeap.size()>k){
                minHeap.poll();
            }
        }
        while (!minHeap.isEmpty()){
            result.add(0,minHeap.poll().getKey());
        }
        return result;
    }
}
