package Algorithm.Top100LikedQuestions;

import java.util.*;

 class leetCode49 {
     public List<List<String>> groupAnagrams(String[] strs) {
         Map<String,List<String>> map = new HashMap();
         for(String str:strs)
         {
             char[] chars = str.toCharArray();
             Arrays.sort(chars);
             String key=String.valueOf(chars);
             if(map.containsKey(key))
             {
                 map.get(key).add(str);

             }
             else
             {
                 List<String> list = new ArrayList();//这里千万不要Arrays.asList() 会生成静态的list，不能修改的啊！！！！
                 list.add(str);
                 map.put(key,list);
             }
         }

         return new ArrayList(map.values());
     }
}
