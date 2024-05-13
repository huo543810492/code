package Algorithm.LinkedListPractice;

public class LeetCode203 {

//    public ListNode removeElements(ListNode head, int val) { //这里的head设定是head也能带数据的，既然他有数据就有可能等于val，然后被移除
//        ListNode sentinel = new ListNode();  //这个节点的作用是既然head可能被移除，那么需要一个更"头"的头结点
//        sentinel.next = head;
//
//        ListNode pv = sentinel;
//        ListNode curr = head;
//        while(curr != null){ //注意这里不能写head.next != null, 因为head可能并没有下个节点，得从head本身是不是空的判断开始
//            if(curr.val == val){
//                pv.next = curr.next;
//            }
//            else{
//                pv = curr; //注意这里如果发生了移除，那么pv就没必要前移
//            }
//            curr=curr.next;
//        }
//        return sentinel.next; //注意这里不能return head，因为如果[7,7,7]这种极端条件下 头结点也要被remove，并不会断开head和后面的连接，所以要返回这个
//    }

}
