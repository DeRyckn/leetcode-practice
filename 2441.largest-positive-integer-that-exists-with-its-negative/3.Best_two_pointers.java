/*
 * @lc app=leetcode id=2441 lang=java
 *
 * [2441] Largest Positive Integer That Exists With Its Negative
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        int left = 0, right = nums.length - 1;
        while(left < right) {
            if (-nums[left] == nums[right]) {
                return nums[right];
            } else if (-nums[left] < nums[right]) {
                left++;
            } else {
                right--;
            }
        }
        return -1;
    }
}
// @lc code=end

