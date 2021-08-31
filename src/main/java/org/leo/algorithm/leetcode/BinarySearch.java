package org.leo.algorithm.leetcode;

/**
 * @ClassName BinarySearch.java
 * @Author Leo
 * @Description
 * @Date 2021/8/18
 */
public class BinarySearch {

    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length;
        while (l <= r) {
            int p = l + (r - l) / 2;
            if (nums[p] == target) {
                return p;
            } else if (nums[p] > target) {
                r = p - 1;
            } else {
                l = p + 1;
            }
        }
        return -1;
    }

}
