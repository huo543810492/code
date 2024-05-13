package Algorithm.Bubble_Sort;

import java.util.Arrays;

public class QuickSort {
    public static void main (String args[]){
        int[] a = new int[] {1,4,11,2,5,66,77,33};
        quick(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }

    public static void quick(int[] array, int left, int right){
        if(left >= right){
            return;
        }
        int p = partition(array,left,right);
        quick(array,left,p-1);
        quick(array,p+1,right);
    }

    public static int partition (int[] array, int left, int right){
        int i = left;
        int j = right;
        int pv = left;//这个可别放到while循环里面
        while (i < j){
            while (i < j && array[j] > array[pv]){
                j--;
            }
            while (i < j && array[i] <= array[pv] ){
                i++;
            }
            if (i < j){
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[pv];
        array[pv] = array[i];
        array[i]  = temp;
        return i;
    }
}
