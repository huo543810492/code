package Algorithm.Top100LikedQuestions;

public class LeetCode114 {
//    TreeNode pre=null;
//    public void flatten(TreeNode root) {
//        doFlatten(root);
//    }
//
//    private void doFlatten(TreeNode root)
//    {
//        if(root==null)
//            return;
//        doFlatten(root.right);
//        doFlatten(root.left);
//        root.right=pre;
//        root.left=null;
//        pre=root;
//    }



    //好想出来，时间复杂度高的，笨办法
//    public void flatten(TreeNode root) {
//        if (root==null)
//            return;
//        Stack<TreeNode> stack = new Stack();
//        List<Integer> list = new ArrayList();
//        stack.add(root);
//        while(!stack.isEmpty())
//        {
//            TreeNode temp = stack.pop();
//            list.add(temp.val);
//            if(temp.right!=null)
//                stack.add(temp.right);
//            if(temp.left!=null)
//                stack.add(temp.left);
//        }
//        root.left=null;
//        for(int i=1;i<list.size();i++)
//        {
//            root.right=new TreeNode(list.get(i));
//            root=root.right;
//        }
//    }
}
