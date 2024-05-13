package Algorithm.SubArrayAndSubsequences;

import java.util.Stack;

public class LeetCode907 {
    Integer sum=0;
    //brute force
    // public int sumSubarrayMins(int[] arr) {
    //     for(int size=1;size<=arr.length;size++){
    //         LinkedList<Integer> path=new LinkedList();
    //         for(int i=0;i<arr.length;i++){
    //             path.add(arr[i]);
    //             if(path.size()==size)
    //             {
    //                 sum+=Collections.min(path);
    //                 path.removeFirst();
    //             }
    //         }
    //     }
    //     return sum;
    // }

    public int sumSubarrayMins(int[] A) {
        // initialize previous less element and next less element of
        // each element in the array

        Stack<int[]> previousLess = new Stack<>();
        Stack<int[]> nextLess = new Stack<>();
        int[] leftDistance = new int[A.length];
        int[] rightDistance = new int[A.length];

        for(int i=0; i<A.length; i++)
        {
            // use ">=" to deal with duplicate elements
            while(!previousLess.isEmpty() && previousLess.peek()[0] >= A[i])
            {
                previousLess.pop();
            }

            leftDistance[i] = previousLess.isEmpty() ? i+1 : i - previousLess.peek()[1];
            previousLess.push(new int[]{A[i], i});

        }

        for(int i=A.length-1; i>=0; i--)
        {
            while(!nextLess.isEmpty() && nextLess.peek()[0] > A[i])
            {
                nextLess.pop();
            }

            rightDistance[i] = nextLess.isEmpty() ? A.length - i : nextLess.peek()[1] - i;
            nextLess.push(new int[]{A[i], i});
        }

        long ans = 0;
        long mod = (long)1000000007;
        for(int i=0; i<A.length; i++)
        {
            ans = (ans + (long)A[i] * leftDistance[i] * rightDistance[i]) % mod;
        }
        return (int)ans;
    }
}
