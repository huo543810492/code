package Algorithm.SubArrayAndSubsequences;

public class LeetCode718 {
    //dp
        public int findLength(int[] nums1, int[] nums2) {
            int[][] dp = new int[nums1.length][nums2.length];
            int res=0;
            for(int i=0;i<nums1.length;i++){
                for(int j=0;j<nums2.length;j++){
                    if(nums1[i]==nums2[j]){
                        dp[i][j]=i>0&&j>0?dp[i-1][j-1]+1:1;
                        res=Math.max(res,dp[i][j]);
                    }
                }
            }
            return res;
        }

    //sliding window
//    public int findLength(int[] A, int[] B) {
//        int res=0;
//        for(int i=0;i<A.length+B.length-1;i++){
//            int startA=Math.max(0,A.length-1-i);
//            int startB=Math.max(0,i-(A.length-1));
//            int count=0;
//            for(int indexA=startA,indexB=startB;indexA<A.length && indexB<B.length; indexA++,indexB++){
//                count=A[indexA]==B[indexB]?count+1:0;
//                res=Math.max(res,count);
//            }
//        }
//
//        return res;
//    }
}
