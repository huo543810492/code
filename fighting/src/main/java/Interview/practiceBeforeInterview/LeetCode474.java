package Interview.practiceBeforeInterview;//package fighting;
//
//import java.util.Arrays;
//
//public class LeetCode474 {
//    public int findMaxForm(String[] strs, int m, int n) {
//        int[][] dp=new int[m+1][n+1];
//        for (String s:strs){
//            int zeroNum=getZerosNum(s);
//            int oneNum=s.length()-zeroNum;
//            for(int i=dp.length-1;i>=1;i--){
//                for (int j=dp[0].length-1;j>=1;j--){
//                    if(i>=zeroNum && j>=oneNum){
//                        dp[i][j]=Math.max(dp[i-m][j-n]+1,dp[i][j]);
//                    }
//                }
//            }
//        }
//        return dp[m][n];
//    }
//
//    private int getZerosNum(String s){
//        int zeorNum=0;
//        for(char c:s.toCharArray()){
//            if(Character.getNumericValue(c)==0){
//                zeorNum++;
//            }
//        }
//        return zeorNum;
//    }
//
//    static class Test{
//        public static void main(String[] args) {
//            LeetCode474 leetCode416 = new LeetCode474();
//            leetCode416.canPartition(new int[]{1,1});
//        }
//        "10","0001","111001","1","0"
//    }
//
//}
