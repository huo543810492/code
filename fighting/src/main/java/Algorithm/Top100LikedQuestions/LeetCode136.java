package Algorithm.Top100LikedQuestions;

public class LeetCode136 {
    public static int singleNumber(int[] nums) {
        int res=0;
        for(int num:nums){
            res ^= num;
        }
        return res;
    }

    public static void main(String[] args) {
        singleNumber(new int[]{4,1,2,1,2});

    }
}
