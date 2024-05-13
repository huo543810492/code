package Algorithm.Top100LikedQuestions;

import java.util.*;

public class LeetCode15 {
    //     //sort
//     List<List<Integer>> res=new ArrayList<>();
//     public List<List<Integer>> threeSum(int[] nums) {
//         Arrays.sort(nums);
//         for(int i=0;i<nums.length;i++)
//         {
//             if(i==0 || nums[i-1]!=nums[i])//第一次防重复
//             {
//                 sumTwo(nums,i);
//             }
//         }
//         return res;
//     }

//     private void sumTwo(int[] nums, int i)
//     {
//         int left=i+1;
//         int right=nums.length-1;
//         while(left<right)
//         {
//             if(nums[i]+nums[left]+nums[right]==0)
//             {
//                 res.add(Arrays.asList(nums[i],nums[left],nums[right]));
//                 left++;
//                 right--;
//                 while(nums[left-1]==nums[left] && left<right)//第二次防重复
//                     left++;
//                 while(nums[right]==nums[right+1] && left<right)
//                     right--;
//             }
//             else if(nums[i]+nums[left]+nums[right]>0)
//                 right--;
//             else
//                 left++;
//         }
//     }

    //No-sort
    public List<List<Integer>> threeSum(int[] nums) {
        Set<Integer> dups=new HashSet<>();//用来防止outer loop的重复
        Set<List<Integer>> temp=new HashSet<>();//结果去重
        Map<Integer,Integer> candidates=new HashMap<>();//放candidates
        for(int i=0;i<nums.length;i++)
        {
            if(dups.add(nums[i]))
            {
                for(int j=i+1;j<nums.length;j++)
                {
                    int complement= -nums[i]-nums[j];
                    if(candidates.containsKey(complement) && i==candidates.get(complement))
                    {
                        List<Integer> list=Arrays.asList(nums[i],nums[j],complement);
                        Collections.sort(list);
                        temp.add(list);
                    }
                    candidates.put(nums[j],i);
                }
            }
        }
        return new ArrayList(temp);
    }
}
