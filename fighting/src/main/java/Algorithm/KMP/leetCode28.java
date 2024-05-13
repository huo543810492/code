package Algorithm.KMP;

import java.util.Arrays;

public class leetCode28 {

    public static int strStr(String haystack, String needle) {
        if(needle.length()>haystack.length())
            return -1;
        if(needle.length()==0)
            return 0;
        int[] next = generateNext(needle);
        int j=0;
        for(int i=0;i<haystack.length();i++)
        {
            while((haystack.charAt(i) != needle.charAt(j)) && j>0)
            {
                j=next[j-1];
            }

            if(haystack.charAt(i) == needle.charAt(j))
            {
                j++;
            }
            if(j == needle.length())//这个不能像回溯一样放前面，反而要放到最后，防止两个传入string都是"a"，这种情况，testcase真的狗
                //由于放到j++后面，所以i都没++就得返回，所以还得加1
                return i-j+1;
        }
        return -1;
    }

    private static int[] generateNext(String needle)
    {
        int j=0;
        int[] next = new int[needle.length()];
        for(int i=1;i<next.length;i++)
        {
            while(j>0 && needle.charAt(i) != needle.charAt(j))//关键，这里是while，如果不相等，不断回退，且j>0情况下
            {
                j=next[j-1]; //记住回退的方法
            }

            if(needle.charAt(i) == needle.charAt(j))
            {
                j++;
            }
            next[i]=j;
        }
        return next;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(generateNext("abababc")));
    }
}
