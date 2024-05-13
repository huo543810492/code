package Algorithm.DynamicProgramming;

import java.util.Arrays;

public class LeetCode322 {
    public static int coinChange(int[] coins, int amount) {
        // 排序，升序
        Arrays.sort(coins);

        // 用来记录中间结果，各种金额所需要的硬币数量
        int[] result = new int[amount + 1];
        result[0] = 0;
        // 遍历所有可能的金额
        for (int currentAmount = 1; currentAmount <= amount; currentAmount++) {
            int minNum = Integer.MAX_VALUE;
            // 遍历所有硬币
            for (int j = 0; j < coins.length; j++) {
                // 当前金额已经比硬币的值小
                int remainAmount = currentAmount - coins[j];
                if (remainAmount < 0) {
                    break;
                }

                // remainAmount无法由硬币组成,就没必要再下面去比较
                if (result[remainAmount] != Integer.MAX_VALUE) {
                    // 取更小的值
                    minNum = Math.min(minNum, result[remainAmount] + 1);//加1是因为刚刚减去了一个coin，得算上
                }
            }

            result[currentAmount] = minNum;
        }

        return result[amount] == Integer.MAX_VALUE ? -1 : result[amount];
    }

    public static void main(String[] args) {
        coinChange(new int[]{2,2},3);
    }
}
