package Algorithm.BST;

public class LeetCode701 {
      public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
          this.left = left;
          this.right = right;
      }
  }

    public static TreeNode insertIntoBST(TreeNode root, int val) {
        //Recursion  天，写的太巧妙了
        if(root==null)
            return new TreeNode(val);//只有为空的时候，会接上，不会走到下面return root

        if(root.val>val)
            root.left=insertIntoBST(root.left, val);
        else
            root.right=insertIntoBST(root.right, val);

        return root;//走到这里return root的，都不是插入val，这里的root就是上一层的root.left or right,所以等于没改变值


//         //Iteration
//         TreeNode curr=root;
//         while(curr!=null){
//             if(curr.val>val)
//             {
//                 if(curr.left==null)
//                 {
//                     curr.left=new TreeNode(val);//关键
//                     return root;
//                 }
//                 else
//                     curr=curr.left;
//             }

//             else
//             {
//                 if(curr.right==null)
//                 {
//                     curr.right=new TreeNode(val);//关键
//                     return root;
//                 }
//                 else
//                     curr=curr.right;
//             }
//         }
//         return new TreeNode(val); //直接root为空的情况
    }

    public static void main(String[] args) {
        TreeNode test = new TreeNode();
        test.left=new TreeNode(2);
        test.right=new TreeNode(7);
        test.left.left=new TreeNode(1);
        test.left.right=new TreeNode(3);
        insertIntoBST(test,5);
    }
}
