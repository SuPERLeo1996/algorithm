package org.leo.algorithm;

/**
 * @ClassName FindFirstAndLastPositionOfElementInSortedArray.java
 * @Author gonglinjie
 * @Description 34.在排序数组中查找元素的第一个和最后一个位置
 * @Date 2021/3/25
 */
public class FindFirstAndLastPositionOfElementInSortedArray {

    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) {
            return new int[]{-1,-1};
        }
        int length = nums.length -1;
        int left = 0;
        int right = length;
        boolean leftFlag = false;
        boolean rightFlag = false;
        while (left <= right) {
            if (nums[left] < target) {
                left += 1;
            } else if (nums[left] == target){
                leftFlag = true;
            } else {
                break;
            }
            if (nums[right] > target) {
                right -= 1;
            } else if (nums[right] == target){
                rightFlag = true;
            } else {
                break;
            }
            if (leftFlag && rightFlag) {
                break;
            }
        }
        if (!leftFlag && !rightFlag) {
            left = -1;
            right = -1;
        }
        return new int[]{left,right};
    }

    public static void main(String[] args) {
        FindFirstAndLastPositionOfElementInSortedArray demo = new FindFirstAndLastPositionOfElementInSortedArray();
        demo.searchRange(new int[]{2,2},3);
    }


    public int[] searchRange1(int[] nums, int target) {
        int leftIdx = binarySearch(nums, target, true);
        int rightIdx = binarySearch(nums, target, false) - 1;
        if (leftIdx <= rightIdx && rightIdx < nums.length && nums[leftIdx] == target && nums[rightIdx] == target) {
            return new int[]{leftIdx, rightIdx};
        }
        return new int[]{-1, -1};
    }

    public int binarySearch(int[] nums, int target, boolean lower) {
        int left = 0, right = nums.length - 1, ans = nums.length;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] > target || (lower && nums[mid] >= target)) {
                right = mid - 1;
                ans = mid;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }
}
