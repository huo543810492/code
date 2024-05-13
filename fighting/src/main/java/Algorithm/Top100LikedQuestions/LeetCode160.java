package Algorithm.Top100LikedQuestions;

public class LeetCode160 {
    //time O(N) Space O(N)
    // public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    //     Set<ListNode> set=new HashSet<>();
    //     while(headB!=null){
    //         set.add(headB);
    //         headB=headB.next;
    //     }
    //     while(headA!=null){
    //         if(set.contains(headA))
    //             return headA;
    //         headA=headA.next;
    //     }
    //     return null;
    // }

    //time O(N) Space O(1)
//    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//        Set<ListNode> set=new HashSet<>();
//        int aLength=0,bLength=0;
//        ListNode tempB = headB;
//        ListNode tempA = headA;
//        while(tempB!=null){
//            bLength++;
//            tempB=tempB.next;
//        }
//        while(tempA!=null){
//            aLength++;
//            tempA=tempA.next;
//        }
//        if(aLength>bLength)
//            return helper(headA,headB,aLength-bLength);
//        else
//            return helper(headB,headA,bLength-aLength);
//    }
//
//    public ListNode helper(ListNode longNode,ListNode shortNode,int diff){
//        for(int i=0;i<diff;i++){
//            longNode=longNode.next;
//        }
//        while(longNode!=null && shortNode!=null){
//            if(longNode==shortNode)
//                return longNode;
//            longNode=longNode.next;
//            shortNode=shortNode.next;
//        }
//        return null;
//    }
}
