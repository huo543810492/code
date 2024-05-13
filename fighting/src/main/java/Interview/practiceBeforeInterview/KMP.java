package Interview.practiceBeforeInterview;

public class KMP {
    public int strStr(String haystack, String needle) {
        int[] next = generateNext(needle);
        int j=0;
        for(int i=0;i<haystack.length();i++){
            while (needle.charAt(j)!=haystack.charAt(i) && j>0){
                j=next[j-1];
            }
            if(needle.charAt(j) == haystack.charAt(i)){
                j++;
                if(j==needle.length()){
                    return i-j+1;
                }
            }
        }
        return -1;
    }


    public int[] generateNext(String neddle){
        int[] next = new int[neddle.length()];
        int j=0;
        for(int i=1;i<neddle.length();i++){
            while(neddle.charAt(j)!=neddle.charAt(i) && j>0){
                j=next[j-1];
            }
            if(neddle.charAt(j)==neddle.charAt(i)){
                j++;
            }
            next[i] = j;
        }
        return next;
    }

    public static class Test{
        public static void main(String[] args) {
            KMP kmp = new KMP();
            kmp.generateNext("abcabv");
        }
    }
}


