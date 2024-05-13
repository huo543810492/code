package Algorithm.Bubble_Sort;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[] array = new int[]{4,3,6,8,2,1,99,411,89};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void bubbleSort(int[] array) {
        for(int i=0;i< array.length-1;i++){
            for(int j=0;j<array.length-1-i;j++){
                if(array[j]>array[j+1])
                    swap(array,j);
            }
        }
    }


    private static void swap(int[] array, int j) {
        int temp=array[j+1];
        array[j+1]=array[j];
        array[j]=temp;
    }

}
