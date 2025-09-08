/*
 * @lc app=leetcode id=2779 lang=java
 *
 * [2779] Maximum Beauty of an Array After Applying Operation
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public int maximumBeauty(int[] nums, int k) {
        Arrays.sort(nums);

        int maxBeauty = 1;
        int left = 0;
        for (int right = 1; right < nums.length; right++) {
            while (nums[right] - nums[left] > 2 * k) {
                left++;
            }
            maxBeauty = Math.max(maxBeauty, right - left + 1);
        }
        return maxBeauty;
    }
}
// @lc code=end

