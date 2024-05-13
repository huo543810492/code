package Algorithm.TreePractice;

import javax.swing.tree.TreeNode;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class LeetCode144 {
    //BFS
    // public List<Integer> preorderTraversal(TreeNode root) {
    //     List<Integer> res=new ArrayList<>();
    //     if(root==null)
    //         return res;
    //     Stack<TreeNode> stack=new Stack<>();
    //     stack.push(root);
    //     while(!stack.isEmpty()){
    //         TreeNode temp=stack.pop();
    //         res.add(temp.val);
    //         if(temp.right!=null){
    //             stack.push(temp.right);
    //         }
    //         if(temp.left!=null){
    //             stack.push(temp.left);
    //         }
    //     }
    //     return res;
    // }

//    //DFS
//    public List<Integer> preorderTraversal(TreeNode root) {
//        List<Integer> res=new ArrayList<>();
//        if(root==null)
//            return res;
//        helper(root,res);
//        return res;
//    }
//    public void helper(TreeNode root,List<Integer>list){
//        if(root==null)
//            return;
//        list.add(root.val);
//        helper(root.left,list);
//        helper(root.right,list);
//    }
}
