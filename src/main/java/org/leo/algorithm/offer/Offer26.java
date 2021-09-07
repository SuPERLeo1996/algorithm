package org.leo.algorithm.offer;

import org.leo.algorithm.assist.TreeNode;

/**
 * @ClassName Offer26.java
 * @Author Leo
 * @Description
 * @Date 2021/9/7
 */
public class Offer26 {

    public boolean isSubStructure(TreeNode A, TreeNode B) {
        return (A != null && B != null) && (recur(A, B) || isSubStructure(A.left,B) || isSubStructure(A.right, B));
    }

    private boolean recur(TreeNode A, TreeNode B) {
        if (B == null) return true;
        if (A == null || A.val != B.val) return false;
        return recur(A.left,B.left) && recur(A.right,B.right);
    }
}
