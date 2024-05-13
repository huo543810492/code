package Algorithm.Top100LikedQuestions;

//public class LeetCode2 {
//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        ListNode dummyHead=new ListNode();
//        ListNode curr=new ListNode();
//        dummyHead.next=curr;//解决最后要返回头结点问题
//        int carry=0;
//        while(l1!=null || l2!=null)
//        {
//            int num1=0;
//            int num2=0;
//            if(l1!=null)
//            {
//                num1=l1.val;
//                l1=l1.next;
//            }
//
//            if(l2!=null)
//            {
//                num2=l2.val;
//                l2=l2.next;
//            }
//            int sum=num1+num2+carry;//关键
//            carry=sum/10;//关键
//            int currVal=sum%10;
//            curr.val=currVal;
//            if(l1!=null || l2!=null)
//            {
//                curr.next=new ListNode();
//                curr=curr.next;
//            }
//        }
//        if(carry>0)//关键 防止[1]  [9] 他们都没有第二个节点，但是新链表应该有第二个节点
//            curr.next=new ListNode(carry);
//        return dummyHead.next;
//    }
//}
