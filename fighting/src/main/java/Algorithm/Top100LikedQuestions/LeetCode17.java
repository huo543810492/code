package Algorithm.Top100LikedQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class LeetCode17 {
    //自己的思路  BFS
    // public List<String> letterCombinations(String digits) {
    //     if(digits==null || digits.length()==0)
    //         return new ArrayList<>();
    //     char[] chas=digits.toCharArray();
    //     List<String> res=new ArrayList<>();
    //     res.add("");
    //     List<Integer> numbers=new ArrayList<>();
    //     List<Integer> letters=new ArrayList<>();
    //     for(char c:chas)
    //     {
    //         numbers.add(Integer.valueOf(c+""));
    //     }
    //     while(numbers.size()>0)//数字list2,3,转成list方便后面进行remove操作，[]就不可以remove
    //     {
    //         int number=numbers.get(0);
    //         if(number>6)
    //         {
    //             if(number==7)
    //                 letters=Arrays.asList(97+(number-2)*3,97+(number-2)*3+1,97+(number-2)*3+2,97+(number-2)*3+3);
    //             if(number==9)
    //                 letters=Arrays.asList(98+(number-2)*3,98+(number-2)*3+1,98+(number-2)*3+2,98+(number-2)*3+3);
    //             if(number==8)
    //                 letters=Arrays.asList(98+(number-2)*3,98+(number-2)*3+1,98+(number-2)*3+2);
    //         }
    //         else
    //             letters=Arrays.asList(97+(number-2)*3,97+(number-2)*3+1,97+(number-2)*3+2);//转成char
    //         List<String> tempList=new ArrayList<>();//临时list，把res每个string进行concat，结果先临时存这里，最后赋值给res
    //         for(String s:res)//关键，遍历res每个string，然后塞入思想，每个string append一个char
    //         {
    //             for(Integer letter:letters)
    //             {
    //                 String temp=s.concat((char)(int)letter+"");
    //                 tempList.add(temp);
    //             }
    //         }
    //         res=new ArrayList(tempList);
    //         numbers.remove(0);
    //     }
    //     return res;
    // }

    //backTracking DFS

    Map<Character,String> map;
//            = Map.of('2', "abc", '3', "def", '4', "ghi", '5', "jkl",
//            '6', "mno", '7', "pqrs", '8', "tuv", '9', "wxyz");//JDK版本问题,我的版本太老

    List<String> res=new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        if(digits==null || digits.length()==0)
            return res;
        backTracking(digits,0,new StringBuilder());
        return res;
    }
    public void backTracking(String digits,int index,StringBuilder path)
    {
        if(path.length()==digits.length())
        {
            res.add(path.toString());
            return;
        }
        String letters = map.get(digits.charAt(index));//和以往的backtracking最大的区别,每个index对应的数组不一样
        for(char c:letters.toCharArray()) //传统的backtracking利用fori实现树形结构，然而这里已经肯定要遍历letters了， 所以就不用fori了，和传统的backtracking不一样
        {
            path.append(c);
            backTracking(digits,index+1,path);
            path.deleteCharAt(path.length()-1);//回溯
        }
    }


    //优化过的BFS
//    public List<String> letterCombinations(String digits) {
//
//        Map<Character,String> map = Map.of('2',"abc",'3',"def",'4',"ghi",'5',"jkl",'6',"mno",'7',"pqrs",'8',"tuv",'9',"wxyz");
//        List<String> list = new ArrayList();
//        if(digits==null || digits.length()==0)
//            return list;
//        list.add("");
//        for(char digit : digits.toCharArray())
//        {
//            String letters = map.get(digit);
//            List<String> temp = new ArrayList();
//            for(char c: letters.toCharArray())
//            {
//                for(String s:list)
//                {
//                    temp.add(s.concat(c+""));
//                }
//            }
//            list = new ArrayList(temp);
//        }
//        return list;
//    }
}
