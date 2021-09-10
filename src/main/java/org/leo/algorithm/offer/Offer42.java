package org.leo.algorithm.offer;

/**
 * @ClassName Offer42.java
 * @Author Leo
 * @Description
 * @Date 2021/9/7
 */
public class Offer42 {
    public int maxSubArray(int[] nums) {
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i] += Math.max(nums[i - 1], 0);
            res = Math.max(res,nums[i]);
        }
        return res;
    }
}
