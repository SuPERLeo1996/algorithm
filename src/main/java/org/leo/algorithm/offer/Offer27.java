package org.leo.algorithm.offer;

import org.leo.algorithm.assist.TreeNode;

/**
 * @ClassName Offer27.java
 * @Author Leo
 * @Description
 * @Date 2021/9/7
 */
public class Offer27 {
    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) return null;
        TreeNode left = mirrorTree(root.left);
        TreeNode right = mirrorTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }


}
