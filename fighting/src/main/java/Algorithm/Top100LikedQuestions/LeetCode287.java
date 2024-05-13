package Algorithm.Top100LikedQuestions;

public class LeetCode287 {
    //Negative Marking
//     public int findDuplicate(int[] nums) {
//         int duplicate = -1;
//         for(int i=0;i<nums.length;i++){
//             int curr=Math.abs(nums[i]);//第一次遇到负数不算，为什么？因为可能只是for循环遇到的
//             if(nums[curr]<0)
//             {
//                 duplicate=curr;
//                 break;
//             }

//             nums[curr]=(-1)*nums[curr];
//         }
//         return duplicate;
//     }

    //Floyd Tortoise and Hare (Cycle Detection)
    //Time Complexity: O(n) Space Complexity: O(1) without modifying the array nums
    public int findDuplicate(int[] nums) {
        int tortoise=nums[0];
        int hare=nums[0];
        do{
            tortoise=nums[tortoise];
            hare=nums[nums[hare]];//这样是走两步
        }while(tortoise!=hare);

        //find intersect
        int intersect=hare;
        int head=nums[0];
        while(intersect!=head){
            head=nums[head];
            intersect=nums[intersect];
        }

        return head;
    }
}
