package Algorithm.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class LeetCode131 {
    public List<List<String>> partition(String s) {
        List<List<String>> res=new ArrayList<>();
        backTracking(res,new ArrayList<>(),0,s);
        return res;
    }
    //关键思想，index是上一层就已经确定好了的分割线，i是这一层试图寻找的新分割线
    public void backTracking(List<List<String>> res, List<String>temp, int index, String s)
    {
        if(index>=s.length()&&!temp.isEmpty()) //注意获取String长度的方法
        {
            res.add(new ArrayList(temp));
            return;
        }
        for(int i=index;i<s.length();i++)
        {
            if(isPalindrome(s,index,i))
            {
                String ss=s.substring(index,i+1);//注意这里是i+1
                temp.add(ss);
            }
            else
                continue; //非常关键
            backTracking(res,temp,i+1,s);
            if(!temp.isEmpty())
                temp.remove(temp.size()-1);
        }
    }

    public boolean isPalindrome(String s,int start,int end)
    {
        boolean res=false;
        for(int i=start,j=end;i<=j;i++,j--)
        {
            if(s.charAt(i)==s.charAt(j))
                res=true;
            else
            {
                res=false;
                break;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println("abc".substring(1,2));
    }
}
