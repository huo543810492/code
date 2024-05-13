package Algorithm.Top100LikedQuestions;

public class LeetCode33 {
    //这种太复杂了，实战感觉写不出来
//     public int search(int[] nums, int target) {
//         if(nums.length==1)
//             return nums[0]==target?0:-1;
//         int rotationIndex=findRotationIndex(nums);
//         if(target>=nums[0] && target<=nums[rotationIndex])
//             return binarySearch(nums, target,0, rotationIndex);
//         else if(target>=nums[rotationIndex+1] && target<=nums[nums.length-1])
//             return binarySearch(nums, target,rotationIndex+1, nums.length-1);
//         return -1;
//     }

//     private int binarySearch(int[] nums, int target, int i, int j)
//     {

//         int index=0;
//         while(i<=j)
//         {
//             index=(i+j)/2;
//             if(nums[index]==target)
//                 return index;
//             if(nums[index]>target)
//             {
//                 j=index-1;
//             }
//             else
//                 i=index+1;
//         }
//         return -1;
//     }

//     private int findRotationIndex(int[] nums)
//     {
//         int i=0;
//         int j=nums.length-1;
//         int index=0;
//         while(i<=j)//感觉二分查找，这里都得有等号
//         {

//             index=(i+j)/2;
//             if(index==nums.length-1)
//                 break;
//             if(nums[index]>nums[index+1]) //关键
//                 return index;
//             if(nums[index]>=nums[0])//为什么等号时候要加i而不是减j，具体原因不懂，但是只有这样才能发现[4,5,1,2,3]的rotationindex
//             {
//                 i=index+1;
//             }
//             // else if(nums[index]<nums[0]) //如果没有等号[1,3]这种就会出现死循环
//             // {
//             //     j=index-1;
//             // }
//             else
//             {
//                 j=index-1;
//             }
//         }
//         return 0;//不能return-1 得考虑可能没有rotation_index的情况
//     }

    //One Pass
    public int search(int[] nums, int target) {
        int left = 0;
        int right =nums.length-1;
        while(left<=right)
        {
            int index=(left+right)/2;
            if(nums[index]==target)
                return index;

            if(nums[0]<=nums[index])//注意这里是nums[index] 和 nums[0] 比较而不是target和nums[0]比较，且有等于号
            {
                if(nums[left]<=target && target<nums[index]) //taget是中继点，左边再向左，情况比较苛刻
                    right=index-1;
                else
                    left=index+1;
            }
            else{
                if(nums[index]<target && target<=nums[right])//taget是中继点，右边再向右，情况比较苛刻
                    left=index+1;
                else
                    right=index-1;
            }
        }
        return -1;
    }
}
