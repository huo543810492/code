package Theory.LearnSystems;

import java.util.Arrays;

public class testArrayCopy {
    public static void main(String[] args) {
        int[] src = {1,2,3,4,5};
        int[] dest = {6,7,8,9,10};
        System.arraycopy(src,0,dest,0,3);
        System.out.println(Arrays.toString(dest));
    }
}
