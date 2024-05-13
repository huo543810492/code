package Algorithm.Top100LikedQuestions;

public class LeetCode148 {
//    public ListNode sortList(ListNode head) {
//        PriorityQueue<ListNode> queue=new PriorityQueue<>((n1,n2)->n1.val-n2.val);
//        ListNode curr=head;
//        while(curr!=null){
//            queue.add(curr);
//            curr=curr.next;
//        }
//
//        ListNode dummy=new ListNode();
//        ListNode prev=dummy;
//        while(!queue.isEmpty()){
//            ListNode node = queue.poll();
//            node.next=null;//这个关键，从queue拿出来的ListNode还都有指向性，指着下一个node，如果不置空，会产生循环链表
//            prev.next=node;
//            prev=node;
//        }
//        return dummy.next;
//    }
}
