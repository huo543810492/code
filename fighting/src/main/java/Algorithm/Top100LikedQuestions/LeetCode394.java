package Algorithm.Top100LikedQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LeetCode394 {
    //TC maxK^countK*n using Stack
//    public String decodeString(String s) {
//        Stack<Character> stack=new Stack();
//        for(char c:s.toCharArray()){
//            if(c==']'){
//                List<Character> decodeList=new ArrayList<>();//注意要放这里，相当于一次[]清空一次list
//                // get the encoded string
//                while(stack.peek()!='[')
//                    decodeList.add(stack.pop());
//
//                // pop [ from the stack
//                if(stack.peek()=='[')
//                    stack.pop();
//                int k=0,base=1; //base是防止k为两位数的情况
//                while(!stack.isEmpty() && Character.isDigit(stack.peek())){ //用也是预防两位数情况
//                    k+=(stack.pop()-'0')*base;
//                    base*=10;
//                }
//                // decode k[decodedString], by pushing decodedString k times into stack
//                while(k>0){
//                    for(int j=decodeList.size()-1;j>=0;j--)
//                        stack.push(decodeList.get(j));
//                    k--;
//                }
//            }else{
//                stack.push(c);
//            }
//        }
//        // get the result from stack
//        char[] arr=new char[stack.size()];
//        for(int j=arr.length-1;j>=0;j--)
//            arr[j]=stack.pop();
//        return new String(arr);
//    }



}
