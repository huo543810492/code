package Algorithm.Trie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCode720 {
    class Solution {
        public String longestWord(String[] words) {
            Trie trie = new Trie();
            String res="";
            for(String s:words)
            {
                trie.put(s);
            }

            for(String s:words)
            {
                if(trie.search(s) && s.length()==res.length())
                {
                    res=res.compareTo(s)>0?s:res;
                }

                else if(trie.search(s) && s.length()>res.length())
                {
                    res=s;
                }
            }
            return res;
        }

        class Trie{
            private Map<Character,Trie> map;
            private boolean isEnd;
            public Trie(){
                map=new HashMap();
            }

            public void setIsEnd(){
                isEnd=true;
            }

            public boolean getIsEnd(){
                return isEnd;
            }

            public void put(String s){
                Trie temp=this;
                for(char c:s.toCharArray())
                {
                    if(temp.map.containsKey(c))
                        temp=temp.map.get(c);
                    else
                    {
                        temp.map.put(c,new Trie());
                        temp=temp.map.get(c);
                    }
                }
                temp.setIsEnd();
            }

            public boolean search(String s){
                Trie temp=this;
                for(char c:s.toCharArray())
                {
                    if(temp.map.containsKey(c) && temp.map.get(c).getIsEnd())//注意这里是temp.get(c).getIsEnd()，而不是temp.getIsEnd，因为第一层，没有get(c)之前，IsEnd肯定是false,用于["a","banana","app","appl","ap","apply","apple"] 意外输出banana的情况,得确保每一个char都是IsEnd
                        temp=temp.map.get(c);
                    else
                        return false;
                }
                return temp.getIsEnd();
            }

        }
    }


    public static void main(String[] args) {
//        longestWord(new String[]{"w","wo","wor","worl","world"});
        System.out.println("e".compareTo("a"));
    }
}
