package Algorithm.SubArrayAndSubsequences;

public class Test {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 5, 5, 2, 6}));
    }

    // you can also use imports, for example:
// import java.util.*;
//import java.util.Arrays;
//// you can write to stdout for debugging purposes, e.g.
//// System.out.println("this is a debug message");
//
//    class Solution {
//        public String solution(String S) {
//            // write your code in Java SE 8
//            if(S==null || S.length()==0)
//                return "";
//
//            char[] chars=S.toCharArray();
//            Arrays.sort(chars);
//            char lastChar=' ';
//            for(char c:chars){
//                if(lastChar==c)
//                    return String.valueOf(lastChar);
//                lastChar=c;
//            }
//            return "";
//        }
//    }

    public static int solution(int[] blocks) {
        // write your code in Java SE 8
        if(blocks==null || blocks.length==0)
            return 0;
        int res=0;
        int a=0,b=0;
        for (int startPoint = 0; startPoint <blocks.length ; startPoint++) {
            a=startPoint;
            b=startPoint;
            while (a>0 && blocks[a-1]>=blocks[a]){
                a--;
            }

            while (b<blocks.length-1 && blocks[b+1]>=blocks[b]){
                b++;
            }
            res=Math.max(res,b-a+1);
        }
        return res;
    }
}
