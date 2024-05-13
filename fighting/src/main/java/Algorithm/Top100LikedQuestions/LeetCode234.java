package Algorithm.Top100LikedQuestions;

public class LeetCode234 {

//    //Copy into Array List and then Use Two Pointer Technique
//    public boolean isPalindrome(ListNode head) {
//        List<Integer> list = new ArrayList<>();
//        if(head==null || head.next==null)
//            return true;
//        while(head!=null){
//            list.add(head.val);
//            head=head.next;
//        }
//        int left=0,right=list.size()-1;
//        while(left<right){
//            if(list.get(left).equals(list.get(right))){
//                left++;
//                right--;
//            }else
//                return false;
//        }
//        return true;
//    }


    //Recursive
//    ListNode frontNode;
//    public boolean isPalindrome(ListNode head) {
//        frontNode=head;
//        return recursive(head);
//    }
//
//    public boolean recursive(ListNode curr) {
//        if(curr==null)
//            return true;
//        if(recursive(curr.next) && curr.val==frontNode.val)//当开始比较curr and front意味着curr到达尾部了
//        {
//            frontNode=frontNode.next;//开始从前往后
//            return true;//通过递归让curr从后往前
//        }else
//            return false;
//    }




    //Reverse Second Half In-place
//    ListNode frontNode;
//    public boolean isPalindrome(ListNode head) {
//        ListNode firstHalfEnd=findFirstHalfEnd(head);
//        ListNode secondHalfStart=firstHalfEnd.next;
//        ListNode p2=reverse(secondHalfStart);
//        while(p2!=null){//关键，因为p2是一半链表，比较短
//            if(head.val!=p2.val)
//                return false;
//            head=head.next;
//            p2=p2.next;
//        }
//        return true;
//    }
//
//    public ListNode findFirstHalfEnd(ListNode head){
//        ListNode fast=head;
//        ListNode slow=head;
//        while(fast.next!=null && fast.next.next!=null){ //注意这检查的是next,next
//            fast=fast.next.next;
//            slow=slow.next;
//        }
//        return slow;
//    }
//
//    public ListNode reverse(ListNode head){
//        ListNode prev=null;
//        while(head!=null){
//            ListNode next=head.next;
//            head.next=prev;
//            prev=head;
//            head=next;
//        }
//        return prev;
//    }

}
