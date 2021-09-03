package org.leo.algorithm.offer;

/**
 * @ClassName Offer52II.java
 * @Author Leo
 * @Description
 * @Date 2021/9/2
 */
public class Offer53II {
    public int missingNumber(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while(left <= right) {
            int m = (left + right) / 2;
            if(nums[m] == m) left = m + 1;
            else right = m - 1;
        }
        return left;
    }
}
