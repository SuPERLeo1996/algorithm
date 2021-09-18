package org.leo.algorithm.hot100;

/**
 * @ClassName Leetcode4.java
 * @Author Leo
 * @Description
 * @Date 2021/9/14
 */
public class Leetcode4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length1 = nums1.length;
        int length2 = nums2.length;
        int totalLength = length1 + length2;

        int right = -1;
        int left = -1;

        int numsStart1 = 0;
        int numsStart2 = 0;
        for (int i = 0; i <= (totalLength / 2); i++) {
            left = right;
            if (numsStart1 < length1 && (numsStart2 >= length2 || nums1[numsStart1] < nums2[numsStart2])) {
                right = nums1[numsStart1];
                numsStart1++;
            } else {
                right = nums2[numsStart2];
                numsStart2++;
            }
        }

        if ((totalLength & 1) == 0) {
            return (left + right) / 2.0;
        } else {
            return right;
        }

    }
}
