/*
 * @lc app=leetcode id=33 lang=java
 *
 * [33] Search in Rotated Sorted Array
 */

// @lc code=start
class Solution {
    public int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        int length = nums.length;
        if (pivot == 0) {
            return binarySearch(nums, 0, length - 1, target);
        }

        if (target > nums[0]) {
            return binarySearch(nums, 0, pivot - 1, target);
        } else if (target < nums[0]) {
            return binarySearch(nums, pivot, length - 1, target);
        } else {
            return 0;
        }
    }

    public int findPivot(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    public int binarySearch(int[] nums, int left, int right, int target) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
// @lc code=end

