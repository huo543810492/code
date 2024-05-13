package Algorithm.DynamicProgramming;

import java.util.Arrays;

public class TempTest {
    public static int maxScoreSightseeingPair(int[] values) {
        int[] dpi= Arrays.copyOf(values,values.length);
        dpi[dpi.length-1]=0;
        int[] dpj=Arrays.copyOf(values,values.length);
        dpj[0]=0;
        int res=0;
        for(int i=1;i<dpi.length-1;i++)
        {
            dpi[i]=Math.max(dpi[i-1],dpi[i]+i);
        }

        for(int j=1;j<dpj.length;j++)
        {
            dpj[j]=Math.max(dpj[j-1],dpj[j]-j);
        }

        for(int i=1;i<dpi.length;i++)
        {
            res=Math.max(res,dpj[i]+dpi[i-1]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] test={2,2,2};
        maxScoreSightseeingPair(test);
    }
}
