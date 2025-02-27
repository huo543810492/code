package Interview.interviewAlgorithms;

/**
 *找中位数和找出数组中第K大/小的数是一种写法
 *同理是都是找出一个数字，而不是全数组排序
 *中位数的区别是，要看数组长度是奇数还是偶数，如果是奇数，那么取index为length/2这个下标的即可，比如1，2，3,4,5,6,7长度是7，取得下标是3，index等于3的数字是4
 *偶数的话，比如1,2,3,4,5,6那就取index为length/2-1，以及index为length/2两个下标的数字的和，再除以二即可，下标要取的是2,3数字为3,4的和再除以2
 *不难看出，如果要找出第k小的数字，其实就是找数组下标为k-1的index即可，因为比如1，2，3,4,5,6,7其中4就是第4小的数字
 *那么要找第k大的话，就是length-k，数组下标为3，4是第4小的数字，也是第4大的数字
 *
 *
 * 代码逻辑和快排十分相似，只是只用一边进行排序，不用递归，通过partition返回的index和K的值对比，最终找到答案
 */

public class QuickSelectMedian  {

    public static void main(String[] args) {
        int[] arr1 = {5, 8, 7, 1, 10, 3, 6, 11}; // 偶数个元素
        int[] arr2 = {5, 8, 7, 1, 10, 3, 6};     // 奇数个元素

        System.out.println("中位数: " + findMedian(arr1)); // 输出 6.5
        System.out.println("中位数: " + findMedian(arr2)); // 输出 6
    }

    private static double findMedian(int[] arr){
        if (arr.length % 2 == 1) {
            // 如果是奇数的话，等于找数组长度除以2的第K小的数
            return quickSelect(arr, 0, arr.length-1, arr.length / 2);
        } else {
            int leftMid = quickSelect(arr, 0, arr.length-1, arr.length / 2 - 1);
            int rightMid = quickSelect(arr, 0, arr.length-1, arr.length / 2);
            return (leftMid+rightMid) / 2.0;
        }
    }

    private static int quickSelect(int[] arr, int left, int right, int k) {
        if (left == right) {
            return arr[left];
        }
        int pivotIndex = partition(arr, left, right);

        if (k == pivotIndex) {
            return  arr[k];
        } else if (k < pivotIndex) {
            return quickSelect(arr, left, pivotIndex - 1, k);
        } else {
            return quickSelect(arr, pivotIndex + 1, right, k);
        }
    }

    private static int partition(int[] arr, int left, int right) {
        int pv = arr[left];
        int i = left;
        int j = right;
        while (i < j){
            while (i < j && arr[j] > pv) {
                j--;
            }
            while (i < j && arr[i] <= pv) {
                i++;
            }
            swap(arr, i, j);
        }
        swap(arr, i, left);
        return i;
    }

    private static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
