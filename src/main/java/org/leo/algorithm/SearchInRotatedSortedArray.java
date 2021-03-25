package org.leo.algorithm;

/**
 * @ClassName SearchInRotatedSortedArray.java
 * @Author gonglinjie
 * @Description 33.搜索旋转排序数组
 * @Date 2021/3/24
 */
public class SearchInRotatedSortedArray {

    public int search(int[] nums, int target) {
        int n = nums.length;
        if (n == 0) {
            return -1;
        }
        if (n == 1) {
            return nums[0] == target ? 0 : -1;
        }
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[0] <= nums[mid]) {
                if (nums[0] <= target && target < nums[mid]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            } else {
                if (nums[mid] < target && target <= nums[n - 1]) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] ints = new int[]{1,3,5};
        SearchInRotatedSortedArray demo = new SearchInRotatedSortedArray();
        int search = demo.search(ints, 1);
    }
}
