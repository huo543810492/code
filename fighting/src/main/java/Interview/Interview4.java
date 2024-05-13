package Interview;

import java.util.*;

public class Interview4 {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        List<int[]> list = Arrays.asList(new int[]{11,7},new int[]{7,3},new int[]{6,5},new int[]{14,4});

        if(backTracking(list,0))
            System.out.println("YES");
        else
            System.out.println("NO");
    }

    public static boolean backTracking(List<int[]> list, int index){
        if(isValid(list))
            return true;

        if(index==list.size())
            return false;

        for(int i=index;i<list.size();i++){
            Collections.swap(list,i,index);
            if(backTracking(list,index+1))
                return true;
            Collections.swap(list,i,index);
        }
        return false;
    }

    public static boolean isValid(List<int[]> list){
        int sum=0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)[0]<sum)
                return false;
            sum+=list.get(i)[1];
        }
        return true;
    }
}
