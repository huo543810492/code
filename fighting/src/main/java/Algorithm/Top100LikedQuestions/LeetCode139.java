package Algorithm.Top100LikedQuestions;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LeetCode139 {
    //Brute Force 2^n
//     public boolean wordBreak(String s, List<String> wordDict) {

//         Set<String> set=new HashSet<>(wordDict);
//         return canWordBreak(s,set);
//     }

//     public boolean canWordBreak(String s, Set<String> set) {

//         if(s==null || s.length()==0)
//         {
//             return true;
//         }

//         for(int i=1;i<=s.length();i++)
//         {
//             if(set.contains(s.substring(0,i)))
//             {
//                 if(canWordBreak(s.substring(i),set)) //if关键，而不是直接return，
//                     return true;
//             }
//         }
//         return false;
//     }

    //dp  n^3
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp=new boolean[s.length()+1];
        Set<String> set=new HashSet(wordDict);
        dp[0]=true;//别忘了
        for(int j=0;j<=s.length();j++){
            for(int i=0;i<j;i++){
                if(dp[i] && set.contains(s.substring(i,j)))
                {
                    dp[j]=true;//这里是j，别混了
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}
