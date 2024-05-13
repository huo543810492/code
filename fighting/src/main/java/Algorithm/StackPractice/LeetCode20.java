package Algorithm.StackPractice;

import java.util.Stack;

public class LeetCode20 {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for(char c:s.toCharArray())
        {
            if(stack.isEmpty() || c=='(' || c=='[' || c=='{')  //思路清晰，为空或者想放左括号都可以
                stack.push(c);
                //想放右括号就得判断一下
            else if(c==')' && stack.peek()=='(' || c==']' && stack.peek()=='[' || c=='}' && stack.peek()=='{')
                stack.pop();
            else//不match
                return false;
        }
        return stack.isEmpty();
    }
}
