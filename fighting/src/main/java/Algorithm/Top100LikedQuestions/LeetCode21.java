package Algorithm.Top100LikedQuestions;

public class LeetCode21 {
    //my way，最容易想到，就是时间空间复杂度都不低
//     public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//         if(list1==null && list2==null)
//             return null;
//         ListNode head=new ListNode();
//         List<Integer> list=new ArrayList<>();
//         ListNode dummy=head;
//         while(list1!=null)
//         {
//             list.add(list1.val);
//             list1=list1.next;
//         }

//         while(list2!=null)
//         {
//             list.add(list2.val);
//             list2=list2.next;
//         }

//         Collections.sort(list);
//         for(int i=0;i<list.size();i++)
//         {
//             head.val=list.get(i);
//             if(i<list.size()-1)
//             {
//                 head.next=new ListNode();
//                 head=head.next;
//             }
//         }
//         return dummy;
//     }

//    //答案巧妙，节省了一些空间
//    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//        ListNode head=new ListNode();
//        ListNode dummy=head;
//        while(list1!=null && list2!=null) //关键
//        {
//            if(list1.val<list2.val)
//            {
//                head.next=new ListNode(list1.val);
//                list1=list1.next;
//            }
//            else
//            {
//                head.next=new ListNode(list2.val);
//                list2=list2.next;
//            }
//            head=head.next;
//        }
//        //现在可能一个listnode为空，也可能是两个，如果一个为空，加上不为空的node正好，
//        //如果两个都为空，那么随便加上哪个都组成了尾部null
//        //巧妙！！！
//        head.next=list1==null? list2:list1;
//        return dummy.next;
//    }
}
