package com.zsw.algorithms;

import com.zsw.algorithms.entity.TreeNode;

/**
 * 给定一个二叉树，找出其最大深度。
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 * 说明: 叶子节点是指没有子节点的节点。
 *
 * @author ZhangShaowei on 2019/5/28 11:28
 **/
public class MaxDepth {



    public int maxDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }
        int deep = 1;
        deep += Math.max(maxDepth(root.left), maxDepth(root.right));

        return deep;
    }


}
