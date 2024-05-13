package Algorithm.KMP;

public class test {
    public static int strStr(String haystack, String needle) {
        int[] next=generateNext(needle);
        int j=0;
        for(int i=0;i<haystack.length();i++){
            while(haystack.charAt(i)!=needle.charAt(j) && j>1){
                j=next[j-1];
            }
            if(needle.charAt(j)==haystack.charAt(i))
                j++;
            if(j==needle.length())
                return i-j+1;
        }
        return -1;
    }

    public static int[] generateNext(String needle){
        int[] next=new int[needle.length()];
        int j=0;
        for(int i=1;i<next.length;i++){
            while(needle.charAt(i)!=needle.charAt(j) && j>1){
                j=next[j-1];
            }
            if(needle.charAt(i)==needle.charAt(j))
                j++;
            next[i]=j;
        }
        return next;
    }

    public static void main(String[] args) {
        strStr("babba",
                "bbb");
    }
}
