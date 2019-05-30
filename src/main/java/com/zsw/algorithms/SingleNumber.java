package com.zsw.algorithms;

/**
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 * <p>
 * 说明：你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 *
 * @author ZhangShaowei on 2019/5/28 15:57
 **/
public class SingleNumber {

    public static int singleNumber(int[] nums) {
        int index = nums[0];
        for (int i = 1; i < nums.length; i++) {
            index = index ^ nums[i];
        }
        return index;
    }

    public static void main(String[] args) {
        System.out.println(3 ^ 4 ^ 3);
        System.err.println(3 ^ 4 ^ 3 ^ 1 ^ 1);
    }


}
