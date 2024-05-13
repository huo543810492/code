package Algorithm.Top100LikedQuestions;

public class LeetCode199 {
    //BFS
// class Solution {
//     public List<Integer> rightSideView(TreeNode root) {
//         List<Integer> list=new ArrayList();
//         if(root==null)
//             return list;
//         Queue<TreeNode> queue=new LinkedList<>();
//         queue.add(root);

//         while(!queue.isEmpty()){
//             int size=queue.size();
//             for(int i=0;i<size;i++){
//                 TreeNode node=queue.poll();
//                 if(i==size-1)//关键，需要返回的就是一层中的最右元素
//                     list.add(node.val);
//                 if(node.left!=null)
//                     queue.add(node.left);
//                 if(node.right!=null)
//                     queue.add(node.right);
//             }
//         }
//         return list;
//     }
// }


    //DFS
//    class Solution {
//        List<Integer> list=new ArrayList();
//        public List<Integer> rightSideView(TreeNode root) {
//            helper(root,0);
//            return list;
//        }
//
//        public void helper(TreeNode node, int level){
//            if(node==null)
//                return;
//            if(level==list.size())//因为level从0开始的,开始level=0,list也是空的，关键
//                list.add(node.val);
//            helper(node.right,level+1);
//            helper(node.left,level+1);
//        }
}
