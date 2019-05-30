package com.zsw.algorithms;

/**
 * 给定一个大小为 n 的数组，找到其中的众数。众数是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
 *
 * 你可以假设数组是非空的，并且给定的数组总是存在众数。
 *
 * 示例 1:
 *   输入: [3,2,3]
 *   输出: 3
 *
 * 示例 2:
 *   输入: [2,2,1,1,1,2,2]
 *   输出: 2
 *
 *
 * @author ZhangShaowei on 2019/5/28 16:26
 **/
public class MajorityElement {

    public static void main(String[] args) {
        System.err.println(majorityElement(new int[]{3,2,3}));
    }

    public static int majorityElement(int[] nums) {

        int length = nums.length;
        int[] arr = new int[length];
        int barrier = nums.length / 2;

        for (Integer i : nums) {
            int j = i.hashCode() & length -1;
            System.out.println(j);
            arr[j] ++;
            if (arr[j] > barrier) {
                return i;
            }
        }
        return 0;
    }


}
