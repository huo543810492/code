package Algorithm.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class LeetCode22 {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        if(n==0)
            return result;
        generateParentheses(result,n-1,n,"(");
        StringBuilder builder=new StringBuilder();
        builder.append("(");
        backTracking(result,builder,n-1,n);
        return result;
    }

    //recursive
    public void generateParentheses(List<String> result, int left, int right, String temp){
        if(left==0 && right==0)
        {
            result.add(temp);
            return;
        }
        if(left>=0 && right>=0){
            if(left<right){
                generateParentheses(result,left,right-1,temp.concat(")"));
                generateParentheses(result,left-1,right,temp.concat("("));
            }

            else if(left==right){
                generateParentheses(result,left-1,right,temp.concat("("));
            }
        }

    }


    //backTracking
    public void backTracking(List<String> res, StringBuilder temp,int left,int right)
    {
        if(left==0 && right==0)
        {
            res.add(temp.toString());
            return;
        }

        if(left>=0 && right>=0){
            if(left== right){
                backTracking(res,temp.append("("),left-1,right);
                temp.deleteCharAt(temp.length()-1);//记得函数
            }

            if(left<right){
                backTracking(res,temp.append("("),left-1,right);
                temp.deleteCharAt(temp.length()-1);

                backTracking(res,temp.append(")"),left,right-1);
                temp.deleteCharAt(temp.length()-1);
            }
        }
    }
}
