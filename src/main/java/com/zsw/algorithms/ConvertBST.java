package com.zsw.algorithms;

import com.zsw.algorithms.entity.TreeNode;

/**
 * 给定一个二叉搜索树（Binary Search Tree），把它转换成为累加树（Greater Tree)，使得每个节点的值是原来的节点值加上所有大于它的节点值之和。
 *
 * 例如：
 *
 * 输入: 二叉搜索树:
 *               5
 *             /   \
 *            2     13
 *
 * 输出: 转换为累加树:
 *              18
 *             /   \
 *           20     13
 *
 * @author ZhangShaowei on 2019/5/29 10:36
 **/
public class ConvertBST {

    private int sum = 0;
    public TreeNode convertBST(TreeNode root) {
        travel(root);
        return root;
    }

    public void travel(TreeNode root){
        if (root == null) {
            return;
        }
        travel(root.right);
        sum += root.val;
        root.val = sum;
        travel(root.left);
    }

}
