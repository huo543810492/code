package Interview;

import java.util.*;

public class Interview2 {

    public static boolean wordBreak(String s, List<String> wordDict) {

        Set<String> set=new HashSet<>(wordDict);
        return canWordBreak(s,set);
    }

    public static boolean canWordBreak(String s, Set<String> set) {

        if(s==null || s.length()==0)
        {
            return true;
        }


        for(int i=1;i<=s.length();i++)
        {
            if(set.contains(s.substring(0,i)))
            {
                return canWordBreak(s.substring(i),set);
            }
        }
        return false;
    }


    public static boolean wordBreak1(String s, List<String> wordDict) {
        // put all words into a hashset
        Set<String> set = new HashSet<>(wordDict);
        return wb(s, set);
    }
    private static boolean wb(String s, Set<String> set) {
        int len = s.length();
        if (len == 0) {
            return true;
        }
        for (int i = 1; i <= len; ++i) {
            if (set.contains(s.substring(0, i)) && wb(s.substring(i), set)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        List<String> list=Arrays.asList("aaaa","aaa");
        wordBreak1("aaaaaaa", list);
    }
}


