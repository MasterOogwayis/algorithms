package com.zsw.algorithms;

import java.util.*;

/**
 * 给定一个范围在  1 ≤ a[i] ≤ n ( n = 数组大小 ) 的 整型数组，数组中的元素一些出现了两次，另一些只出现一次。
 * 找到所有在 [1, n] 范围之间没有出现在数组中的数字。
 * 您能在不使用额外空间且时间复杂度为O(n)的情况下完成这个任务吗? 你可以假定返回的数组不算在额外空间内。
 *
 * 示例:
 * 输入:
 * [4,3,2,7,8,2,3,1]
 * 输出:
 * [5,6]
 *
 * @author ZhangShaowei on 2019/5/31 9:12
 **/
public class FindDisappearedNumbers {

    public static void main(String[] args) {
        List<Integer> l1 = findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1});
        List<Integer> l2 = findDisappearedNumbers(new int[]{1, 1});
        List<Integer> l3 = findDisappearedNumbers(new int[]{2, 2});
        List<Integer> l4 = findDisappearedNumbers(new int[]{4, 4, 5, 5, 6, 6});

        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        System.err.println(l4);
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        if (nums == null || nums.length == 0) {
            return Collections.emptyList();
        }
        Arrays.sort(nums);
        int len = nums.length;

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            nums[(nums[i] - 1) % len] += len;

        }
        for (int j = 0; j < len; ++j) {
            if (nums[j] <= len) {
                list.add(j + 1);
            }
        }
        return list;
    }

}
