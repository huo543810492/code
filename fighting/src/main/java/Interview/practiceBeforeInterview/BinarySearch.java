package Interview.practiceBeforeInterview;

public class BinarySearch {

    public static int search(int[] arr, int target){
        int left=0,right=arr.length-1;
        while (left<=right){
            int index=(left+right)/2;
            if(arr[index] == target){
                return index;
            }else if(arr[index] > target){
                right = index-1;
            }else{
                left = index+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,6,7,9,11,22,33};
        System.out.println(search(arr,7));
    }
}