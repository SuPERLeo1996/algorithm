package org.leo.algorithm.offer;

import org.leo.algorithm.assist.TreeNode;

/**
 * @ClassName Offer28.java
 * @Author Leo
 * @Description
 * @Date 2021/9/7
 */
public class Offer28 {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) {
            return true;
        }
        return recur(root.left,root.right);
    }

    private boolean recur(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if (left == null || right == null || left.val != right.val) return false;
        return recur(left.left,right.right) && recur(left.right,right.left);
    }

}
