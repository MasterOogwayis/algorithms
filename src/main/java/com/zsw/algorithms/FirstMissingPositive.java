package com.zsw.algorithms;

/**
 * 给定一个未排序的整数数组，找出其中没有出现的最小的正整数。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [1,2,0]
 * 输出: 3
 * 示例 2:
 * <p>
 * 输入: [3,4,-1,1]
 * 输出: 2
 * 示例 3:
 * <p>
 * 输入: [7,8,9,11,12]
 * 输出: 1
 * 说明:
 * <p>
 * 你的算法的时间复杂度应为O(n)，并且只能使用常数级别的空间。
 *
 * @author ZhangShaowei on 2019/5/31 11:18
 **/
public class FirstMissingPositive {

    public static void main(String[] args) {

        System.out.println(firstMissingPositive(new int[]{1, 2, 0}));
        System.out.println(firstMissingPositive(new int[]{3, 4, -1, 1}));
        System.out.println(firstMissingPositive(new int[]{7, 8, 9, 11, 12}));

    }

    /**
     * 思路： 1. 首先针对无序的数组要么嵌套循环 时间复杂度为 o(n^2)
     *        2. 要么先一步处理元素位置，这种方式才可能达到时间复杂度 o(n)
     *
     * @param nums
     * @return
     */
    public static int firstMissingPositive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 1;
        }
        int index = 0;
        int len = nums.length;
        // 将 nums[i] 设置到 对应下标，若大于数组长度 len 则设置为 -1，小于 0 则不处理
        for (int i = 0; i < len; i++) {
            if (nums[i] > len || nums[i] == 0) {
                nums[i] = -1;
            } else if (nums[i] > 0) {
                nums[nums[i] - 1] = nums[i];
            }
        }

        return index;

    }

}
