package com.zsw.algorithms;

/**
 * 汉明距离
 * 两个整数之间的汉明距离指的是这两个数字对应二进制位不同的位置的数目。
 * 给出两个整数 x 和 y，计算它们之间的汉明距离。
 *
 * 输入: x = 1, y = 4
 * 输出: 2
 * 1   (0 0 0 1)
 * 4   (0 1 0 0)
 *
 * @author ZhangShaowei on 2019/5/28 10:26
 **/
public class HammingDistance {

    public static void main(String[] args) {
        System.out.println(hammingDistance(5, 1241525));
    }


    public static int hammingDistance(int x, int y) {
        int hamming = x ^ y;
        int cnt = 0;
        while(hamming > 0){
            hamming = hamming & (hamming - 1);
            cnt++;
        }
        return cnt;
//        return Integer.toBinaryString(x ^ y).replaceAll("0", "").length();
    }

}
