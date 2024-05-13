package Interview.practiceBeforeInterview;

import java.util.ArrayList;
import java.util.List;

public class isPalindrome1 {
    public static void main(String[] args) {
        System.out.println(partition("efe"));

    }
    static List<List<String>> res = new ArrayList<>();

    public static List<List<String>> partition(String s) {
        backTracking(s,0,new ArrayList<>());
        return  res;
    }

    private static void backTracking(String s, int index, List<String> path) {
        if(index == s.length()){
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i=index; i<s.length(); i++){
            String temp = s.substring(index,i+1);
            if(isPalindrome(temp)){
                path.add(temp);
                backTracking(s,i+1,path);
                path.remove(path.size()-1);
            }
        }

    }

    private static boolean isPalindrome(String s){
        int left=0,right=s.length()-1;
        while (left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
