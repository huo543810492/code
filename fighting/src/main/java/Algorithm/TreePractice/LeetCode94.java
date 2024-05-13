package Algorithm.TreePractice;

//inOrder tree traversal 完全写不出来，记住伟大的思想吧
public class LeetCode94 {
//    public List<Integer> inorderTraversal(TreeNode root) {
//        ArrayList<Integer> list = new ArrayList<>();
//        helper(root,list);
//        return list;
//    }
//
//    public void helper (TreeNode root, ArrayList<Integer>list){
//
//        if(root != null){
//            helper(root.left,list);
//            list.add(root.val);
//            helper(root.right,list);
//        }
//
//    }

    //第二种解法，用栈的解法
//    public List<Integer> inorderTraversal(TreeNode root) {
//        ArrayList<Integer> list = new ArrayList<>();
//        Stack<TreeNode> stack = new Stack<>();
//        TreeNode curr = root;
//        while (curr!=null || !stack.isEmpty()){
//            while(curr != null){//先把一个分支的最左边都放入栈中，之后通过pop可以拿到左和中的node，因为树的特性
// '中'也会存入，再去判断右边是否也有元素，如果没有就pop拿到左，或者中的元素
//                stack.push(curr);
//                curr = curr.left;
//            }
//
//            curr = stack.pop();
//            list.add(curr.val);
//            curr = curr.right;//写的很巧妙，多看看吧
//
//
//        }
//        return list;
//    }
}
