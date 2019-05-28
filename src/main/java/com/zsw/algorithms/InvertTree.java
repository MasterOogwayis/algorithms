package com.zsw.algorithms;

import com.zsw.algorithms.entity.TreeNode;

/**
 *
 *
 * @author ZhangShaowei on 2019/5/28 10:47
 **/
public class InvertTree {


    public static void main(String[] args) {

    }


    public static TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode right = root.right;
        root.right = root.left;
        root.left = right;
        invertTree(root.right);
        invertTree(root.left);
        return root;
    }


}
