package Interview.practiceBeforeInterview;

public class isSwichingNumber {
    public static int solution(int[] arr){
        if(arr.length==1){
            return 1;
        }
        int even=arr[0],odd=arr[1];
        int left=0, max_length=0;
        for (int i=2;i<arr.length;i++){
            if(i%2==0 && arr[i]!=even || i%2==1 && arr[i]!=odd){
                max_length=Math.max(max_length,i-left+1);
                left=i;
                if(i%2==0){
                    even=arr[i];
                    odd=arr[i-1];
                }else {
                    even=arr[i-1];
                    odd=arr[i];
                }
            }
        }
        return Math.max(max_length,arr.length-left);
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{7,4,-2,4,-2,-9}));
    }
}
