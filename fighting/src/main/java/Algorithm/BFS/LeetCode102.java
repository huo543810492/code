package Algorithm.BFS;

public class LeetCode102 {
//    public List<List<Integer>> levelOrder(TreeNode root) {
//        List<List<Integer>> result = new ArrayList<>();
//        Queue<TreeNode> queue = new LinkedList<>();
//        if(root == null)
//            return result;
//        queue.add(root);
//        bfs(result,queue,new ArrayList<Integer>());
//        return result;
//    }
//
//public void bfs(List<List<Integer>>result,Queue<TreeNode>queue,List<Integer>tempList){
//    if(tempList.size()!=0)
//        result.add(tempList);
//    if(queue.size()==0)
//        return;
//    tempList = new ArrayList<>();
//    int size = queue.size();//注意这里需要这个变量，不然如果for循环i<queue.size的话，queue的大小是在变的，会出错
//    for(int i=0;i<size;i++){
//        TreeNode temp = queue.poll();
//        tempList.add(temp.val);
//        if(temp.left!=null)
//            queue.add(temp.left);
//        if(temp.right!=null)
//            queue.add(temp.right);
//    }
//    bfs(result,queue,tempList);//朝向下一层
//
//}
}
