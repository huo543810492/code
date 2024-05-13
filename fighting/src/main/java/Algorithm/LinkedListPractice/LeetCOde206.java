package Algorithm.LinkedListPractice;

public class LeetCOde206 {

//    public ListNode reverseList(ListNode head) {  第二次刷的时候自己的解法
//        if(head == null)
//            return null;
//        ListNode curr = head;
//        ListNode temp = new ListNode();
//        ListNode prev = null; //注意这里一定要是null而不是new ListNode(),因为new出来的会有默认value 0，从而使链表多了一个节点
//        while(curr != null){
//            temp = curr.next;
//            curr.next = prev;
//            prev = curr;
//            curr = temp;
//        }
//        return prev;
//
//    }


//recursion写法
//    public ListNode reverseList(ListNode head) {
//
//        if(head == null || head.next == null){
//            return head;
//        }
//        ListNode p = reverseList(head.next);
//        head.next.next = head;
//        head.next = null;
//
//        return p;
//    }
}
