package org.leo.algorithm.offer;

/**
 * @ClassName Offer53.java
 * @Author Leo
 * @Description
 * @Date 2021/9/2
 */
public class Offer53 {
    public int search(int[] nums, int target) {
        int count = 0;

        if (nums.length == 1) {
            if (target == nums[0]) {
                return 1;
            } else {
                return 0;
            }
        }
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            if (nums[l] < target) {
                l += 1;
            } else if (nums[l] == target) {
                for (; l <= r; l++) {
                    if (nums[l] == target) {
                        count++;
                    } else {
                        break;
                    }
                }
                break;
            } else {
                break;
            }
            if (nums[r] > target) {
                r -= 1;
            } else if (nums[r] == target) {
                for (; r >= l; r--) {
                    if (nums[r] == target) {
                        count++;
                    } else {
                        break;
                    }
                }
                break;
            } else {
                break;
            }

        }
        return count;
    }

    public static void main(String[] args) {
        Offer53 offer53 = new Offer53();
        int[] p = {2,2};
        int i = offer53.search(p,2);
    }
}
