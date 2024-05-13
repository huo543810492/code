package Algorithm.Top100LikedQuestions;

public class LeetCode19 {
    //my way
//     public ListNode removeNthFromEnd(ListNode head, int n) {
//         if(head==null)
//             return null;
//         ListNode reversedHead= reverseLinkedList(head);
//         ListNode sential=new ListNode();
//         sential.next=reversedHead;
//         ListNode prev=null;
//         if(n==1)
//             return reverseLinkedList(sential.next.next);
//         while(n>=1)
//         {
//             if(n==1)
//             {
//                 prev.next=reversedHead.next;//移除该位置的node
//                 n--;
//             }
//             else{
//                 prev=reversedHead;
//                 reversedHead=reversedHead.next;
//                 n--;
//             }

//         }
//         return reverseLinkedList(sential.next);
//     }

//     public ListNode reverseLinkedList (ListNode head)
//     {
//         ListNode prev=null;
//         while(head!=null)
//         {
//             ListNode next=head.next;
//             head.next=prev;
//             prev=head;
//             head=next;
//         }
//         return prev;
//     }


    //two pass
//    public ListNode removeNthFromEnd(ListNode head, int n) {
//        if(head==null)
//            return null;
//        int length=0;
//        ListNode sential = new ListNode();
//        sential.next=head;
//        ListNode first=sential;
//
//        while(head!=null)
//        {
//            head=head.next;
//            length++;
//        }
//        int toBeRemoved=length-n;
//
//        while(toBeRemoved > 0)
//        {
//            first=first.next;
//            toBeRemoved--;
//        }
//        first.next=first.next.next;
//
//        return sential.next;
//    }
}
