/*
 * @lc app=leetcode id=1838 lang=java
 *
 * [1838] Frequency of the Most Frequent Element
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int result = 1;

        int left = target;
        for (int target = nums.length - 1; target >= 0; target--) {
            long sumActual = nums[target];
            while (left > 0) {
                left--;
                long sumTarget = (long)nums[target] * (target - left + 1);
                sumActual += nums[left];

                if (sumTarget - sumActual > k) {
                    break;
                }
                result = Math.max(result, target - left + 1);
            }
        }
        return result;
    }
}
// @lc code=end

