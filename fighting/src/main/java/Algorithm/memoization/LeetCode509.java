package Algorithm.memoization;

import java.util.Arrays;

//Fibonacci
public class LeetCode509 {
    public static int fibonacciNumber(int i){
        int[] array = new int[i+1];
        Arrays.fill(array,-1);
        array[0]=0;
        array[1]=1;
        for(int j=2;j<=i;j++){
            array[j]=array[j-1]+array[j-2];
        }
        return array[i];
    }

    public static void main(String[] args) {
        System.out.println(fibonacciNumber(4));
    }
}
