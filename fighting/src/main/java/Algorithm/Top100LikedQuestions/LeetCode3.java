package Algorithm.Top100LikedQuestions;

import java.util.HashMap;
import java.util.Map;

public class LeetCode3 {
    //     public int lengthOfLongestSubstring(String s) {
//         Map<Character,Integer> chars=new HashMap<>();
//         int right=0;
//         int count=0;
//         int res=0;
//         int left=0;
//         while(right < s.toCharArray().length)
//         {
//             char rightChar=s.charAt(right);
//             if(chars.get(rightChar)!=null)
//                 chars.put(rightChar,chars.get(rightChar)+1);
//             else
//                 chars.put(rightChar,1);
//             while(chars.get(rightChar)>1)
//             {
//                 char leftChar=s.charAt(left);
//                 chars.put(leftChar,chars.get(leftChar)-1);//关键，也是和之前学的数字滑动窗口的区别，数字的减去left位置的数就行，而这里要把重复元素之前的left都减掉, 比如"pwwkew" right=2时候发现重复，如果只是减去w在chars的值,那么left会得1，count得2，等于有两个元素ww，明显这是不对的，要从left开始减，减到chars[right]=1为止
//                 left++;
//             }

//             count=right-left+1;
//             res=Math.max(count,res);
//             right++;
//         }
//         return res;
//     }

    public  static int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map=new HashMap<>();
        int res=0;
        int lastRepeat=0;
        char[] chars=s.toCharArray();
        for(int i=0;i<chars.length;i++)
        {
            char c=chars[i];
            if(map.get(c)!=null)
                lastRepeat=Math.max(lastRepeat,map.get(c));//关键1，防止上一次重复比这次更靠后问题abba
            res = Math.max(res, i - lastRepeat + 1);//如果没发生重复，正确算法
            map.put(c,i+1);//关键2，如果发生了重复，该下标的元素也不能要，得从下一个元素开始计算，比如abccb如果不加1会算出来得4
        }
        return res;
    }

    public static void main(String[] args) {
        lengthOfLongestSubstring("abba");
    }
}
