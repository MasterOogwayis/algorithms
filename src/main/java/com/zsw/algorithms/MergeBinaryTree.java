package com.zsw.algorithms;

import com.zsw.algorithms.entity.TreeNode;

/**
 * 算法 合并二叉树
 * 给定两个二叉树，想象当你将它们中的一个覆盖到另一个上时，两个二叉树的一些节点便会重叠。
 * 你需要将他们合并为一个新的二叉树。合并的规则是如果两个节点重叠，那么将他们的值相加作为节点合并后的新值，
 * 否则不为 NULL 的节点将直接作为新二叉树的节点。
 *
 * @author ZhangShaowei on 2019/5/28 10:00
 **/
public class MergeBinaryTree {

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t1r = new TreeNode(2);
        TreeNode t1l = new TreeNode(3);
        t1.right = t1r;
        t1.left = t1l;

        TreeNode t2 = new TreeNode(4);
        TreeNode t2r = new TreeNode(5);
        TreeNode t2l = new TreeNode(6);
        t2l.right = new TreeNode(10);
        t2.right = t2r;
        t2.left = t2l;

        TreeNode treeNode = mergeTrees(t1, t2);
        System.out.println(treeNode);

    }


    public static TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null) {
            return t2;
        }
        if (t2 == null) {
            return t1;
        }

        // 1. 创建新 root 节点
        TreeNode treeNode = new TreeNode(t1.val + t2.val);
        // 2. 处理左节点
        treeNode.left = mergeTrees(t1.left, t2.left);
        // 3. 处理右节点
        treeNode.right = mergeTrees(t1.right, t2.right);

        return treeNode;
    }


}
