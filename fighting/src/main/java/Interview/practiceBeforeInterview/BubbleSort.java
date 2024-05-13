package Interview.practiceBeforeInterview;

import java.util.Arrays;

public class BubbleSort {

    private static void bubbleSort(int[] arr){
        for (int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {11,1,3,2,5,12,8};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr,int left,int right) {
        if(arr==null||arr.length<=1){
            return;
        }
        if(left>=right){
            return;
        }
        int index = doQuickSort(arr,left,right);
        quickSort(arr,left,index-1);
        quickSort(arr,index+1,right);
    }

    private static int doQuickSort(int[] arr,int left,int right){
        int index=left;
        while(left<right){
            while(left<right && arr[right]>arr[index]){
                right--;
            }
            while(left<right && arr[left]<=arr[index]){
                left++;
            }
            swap(arr,left,right);
        }
        swap(arr,index,left);
        return left;
    }

    private static void swap(int[] arr, int left, int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}


