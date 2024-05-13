package Algorithm.Recursion;

public class LeetCode344 {
    public void reverseString(char[] s) {
        // twoPointer(s);
        recursive(s,0,s.length-1);
    }
    public void twoPointer(char[] s){
        for(int i=0;i<s.length;i++){
            if(i>=s.length-1-i)
                break;
            char temp = s[s.length-1-i];
            s[s.length-1-i]=s[i];
            s[i]=temp;
        }
    }

    public void recursive (char[]s, int left, int right){
        if(left >= right) //不用返回值，这里作为最后一步，也是唯一不用交换的一步
            return;
        recursive (s,left+1,right-1);
        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;
    }

}
