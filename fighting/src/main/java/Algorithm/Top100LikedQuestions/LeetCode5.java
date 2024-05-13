package Algorithm.Top100LikedQuestions;

public class LeetCode5 {
    //brute force
//     public String longestPalindrome(String s) {

//         String res="";
//         int count=-1; //注意这里count不能从0开始，不然当s="a"时，j-i>count，没法往下走
//         for(int i=0;i<s.length();i++){
//             for(int j=i;j<s.length();j++){
//                 if(isPalindrome(s.substring(i,j+1)))
//                 {
//                     if(j-i>count)
//                     {
//                         res=s.substring(i,j+1);
//                         count=j-i;
//                     }
//                 }
//             }
//         }
//         return res;
//     }

//     public boolean isPalindrome(String s){
//         int left=0;
//         int right=s.length()-1;
//         while(left<right)
//         {
//             if(s.charAt(left)!=s.charAt(right))
//                 return false;
//             left++;
//             right--;
//         }
//         return true;
//     }

    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i); //奇数
            int len2 = expandAroundCenter(s, i, i + 1);//偶数
            int len = Math.max(len1, len2);
            if (len > end - start) {
                if(len1>len2)
                {
                    start= i-len1/2;
                    end=i+len1/2;
                }
                else if(len1<len2)
                {
                    start=i-(len2-1)/2;
                    end=i+len2/2;
                }
            }
        }
        return s.substring(start, end + 1);
    }

    private int expandAroundCenter(String s, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;//因为退出while肯定是不满足条件了，也就是说L多减了一次，R也多加了一次，本来应该是R-L+1但是减去多的操作就要-2，最后变成减1
    }
}
