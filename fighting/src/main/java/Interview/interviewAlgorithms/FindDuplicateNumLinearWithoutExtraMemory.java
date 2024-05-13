package Interview.interviewAlgorithms;

/**
 *  我现在有一个数组，里面只会有正整数且是连续的，现在确定会有一个数字是重复的，如果在时间复杂度O(n)情况下，且不用额外内存情况下发现这个数字
 *  举例[2,3,4,1,5,1] 应该返回1
 *
 *  异或赋值运算符。它将左操作数与右操作数进行按位异或运算，并将结果赋给左操作数。异或的英文是 "XOR"
 *  int a = 5;  // 二进制表示为 101
 *  int b = 3;  // 二进制表示为 011
 *  a ^= b;
 *
 *    101   (a)
 *  ^ 011   (b)
 *  -----
 *    110   (a ^ b)
 *  a 的新值为 6。
 *
 * 在给定数组中找到重复的数字，如果数组只包含连续的正整数，并且有一个数字重复，你可以利用数学公式和异或运算来找到重复的数字，而不需要额外的内存空间。这里有一个基于异或运算的方法来解决这个问题：
 *
 * 异或数组中的所有数字：这将把所有数字混合在一起。
 * 异或所有连续的数字，从1到数组长度减一：由于数组包含一个重复的数字，异或所有连续的数字会取消掉除了重复数字以外的其他数字。
 * 将上述两次异或的结果再进行异或：这将剔除所有非重复的数字，留下重复的那个数字。
 * 这个方法有效是因为异或运算有以下性质：
 *
 * 一个数与自身异或的结果是0（即 n ^ n = 0）。
 * 任何数与0异或仍然是它本身（即 n ^ 0 = n）。
 * 异或运算是可交换的，即 a ^ b ^ c = a ^ c ^ b。
 *
 * 使用公式，数组[2, 3, 4, 1, 5, 1]的异或结果， 其实等于数组[2, 3, 4, 5]的异或结果，因为n ^ n = 0 且 n ^ 0 = n，所以xor为，除了重复数字的XOR结果！！
 * xorFrom1ToN为数组长度减一的异或结果，也就是1到5的异或结果，那么一个是[2, 3, 4, 5]的异或结果，另一个是[1，2, 3, 4, 5]的异或结果，
 * 他们再去异或的话，就会拿到不一样的数，作为结果，这个结果也就是重复的那个数字！
 */
public class FindDuplicateNumLinearWithoutExtraMemory {
    public static int findDuplicate(int[] nums) {
        int xor = 0;
        int xorFrom1ToN = 0;

        // XOR all the array elements, XOR即使包括重复数字，但是并不意味着会等于0
        for (int num : nums) {
            xor ^= num;
        }

        // XOR all numbers from 1 to nums.length - 1
        for (int i = 1; i < nums.length; i++) {
            xorFrom1ToN ^= i;
        }

        // XOR the above two results to get the duplicate number
        return xor ^ xorFrom1ToN;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 1, 5, 1, 6}; // Example array
        System.out.println("The duplicate number is: " + findDuplicate(nums));
    }
}
