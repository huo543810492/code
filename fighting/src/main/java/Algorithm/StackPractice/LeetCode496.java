package Algorithm.StackPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class LeetCode496 {//monotonous stack
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map = new HashMap<>();
        Stack<Integer> stack=new Stack<>();
        int[] res=new int[nums1.length];
        for(int num : nums2){
            while(!stack.isEmpty() && stack.peek()<num)
            {
                map.put(stack.pop(),num);
            }
            stack.push(num);
        }

        while(!stack.isEmpty()){
            map.put(stack.pop(),-1);
        }

        for(int i=0;i<nums1.length;i++){
            res[i]=map.get(nums1[i]);
        }

        return res;
    }
}
