package Algorithm.Top100LikedQuestions;

public class LeetCode142 {
//    public ListNode detectCycle(ListNode head) {
//        if(head==null||head.next==null)
//            return null;
//
//        Set<ListNode> visited=new HashSet<>();
//        while(head!=null){
//            if(visited.contains(head))
//                return head;
//            visited.add(head);
//            head=head.next;
//        }
//        return null;
//    }

    //Floyd's Tortoise and Hare
    //time complexity O(n) sapce O(1)
//    public ListNode detectCycle(ListNode head) {
//        if(head==null||head.next==null)
//            return null;
//
//        ListNode intersect=getIntersect(head);
//
//        if(intersect==null)//no cycle in list
//            return intersect;
//
//        while(intersect!=head){//advance both head and intersect, to find entrance F=nc+b
//            intersect=intersect.next;
//            head=head.next;
//        }
//        return head;
//    }
//
//    public ListNode getIntersect(ListNode head){
//        ListNode hare=head;
//        ListNode tortoise=head;
//
//        while(hare!=null && hare.next!=null){
//            hare=hare.next.next;
//            tortoise=tortoise.next;
//            if(hare==tortoise)
//                return hare;
//        }
//        return null;
//    }
}
