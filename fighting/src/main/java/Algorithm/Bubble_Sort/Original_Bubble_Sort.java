package Algorithm.Bubble_Sort;

import java.util.Arrays;

public class Original_Bubble_Sort {
    public static void main (String[] args){
        int[] array = new int[]{4,3,6,8,2,1,99,411,89};
//        sort(array);
//        normalSort(array);
        optimizeSort(array);
        System.out.println(Arrays.toString(array));
    }

    //自己没看教程写的版本，写的还不错
    public static void sort (int[] array){
        int size = array.length;  //注意这里是length,没有括号，不是list的size方法
        int i;
        for (i = 0; i< size;i++){//每轮能确定右边的一位最大值，和左边的一位最小值
            for(int j = i+1; j < size; j ++){
                if (array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void normalSort(int[] array){
        int size = array.length;
        for(int i = 0; i < size - 1; i++){//这里减一是因为，到最后一个数，没法比较，也没必要了
            for (int j = 0; j < size - 1 - i; j++){ //这里减一是因为，下面会加一，如果不减，数组越界了,注意j是从0开始的
                if (array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    public static void optimizeSort(int[] array){
        for (int i = 0; i < array.length - 1; i++){
            boolean isSwapped = false;  //优化：如果内层循环一轮都没有发生交换，说明已经有序了，没必要继续下去了

            for(int j = 0; j < array.length - 1 - i; j ++){
                if (array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    isSwapped = true;
                }
            }
            if (!isSwapped)
                break;
        }
    }


}
