package Algorithm.Top100LikedQuestions;

public class LeetCode98 {
//    public boolean isValidBST(TreeNode root) {
//        // return validBST(root,null,null);//BFS
//        return DFS(root,null);//DFS
//    }
//
//    public boolean validate(TreeNode root, Integer low, Integer high) {
//        // Empty trees are valid BSTs.
//        if (root == null) {
//            return true;
//        }
//        // The current node's value must be between low and high.
//        if ((low != null && root.val <= low) || (high != null && root.val >= high)) {
//            return false;
//        }
//        // The left and right subtree must also be valid.
//        return validate(root.right, root.val, high) && validate(root.left, low, root.val);
//    }
//
//    //DFS不建议用helper递归的方式去处理，因为到时候return的时候会很麻烦
//    //完全就是墙上中序用栈解决的思路
//    private boolean DFS(TreeNode root, Integer prev)
//    {
//        Stack<TreeNode> stack = new Stack();
//        while(root!=null || !stack.isEmpty())
//        {
//            while(root!=null)
//            {
//                stack.push(root);
//                root = root.left;
//            }
//            root=stack.pop();
//            if(prev!=null && root.val<=prev)
//                return false;
//            prev=root.val;
//            root=root.right;
//        }
//        return true;
//    }
}
