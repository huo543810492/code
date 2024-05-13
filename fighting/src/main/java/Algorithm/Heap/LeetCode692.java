package Algorithm.Heap;

import java.util.*;

public class LeetCode692 {
    public static List<String> topKFrequent(String[] words, int k) {
        ArrayList<String> result = new ArrayList<>();
        HashMap<String,Integer> map = new HashMap<>();

        for(int i = 0; i<words.length;i++){
            if(map.get(words[i]) == null)
                map.put(words[i],1);
            else
                map.put(words[i],map.get(words[i])+1);
        }

        PriorityQueue<Map.Entry<String, Integer>> minStack = new PriorityQueue<>(
                (a,b) -> a.getValue() == b.getValue() ? a.getKey().compareTo(b.getKey()) : b.getValue()-a.getValue()
        );

        for (Map.Entry<String, Integer> entry:map.entrySet()){
            minStack.add(entry);
            if(minStack.size()>k)
                minStack.poll();
        }

        while(!minStack.isEmpty()){
            result.add(minStack.poll().getKey());
        }

        return result;
    }

    public static void main(String[] args) {
        String[] words = {"i","love","leetcode","i","love","coding"};
        String[] words2 = {"the","day","is","sunny","the","the","the","sunny","is","is"};
        List<String> result = topKFrequent(words2,4);
        System.out.println(result.toString());
    }
}
