/*
 * @lc app=leetcode id=2016 lang=java
 *
 * [2016] Maximum Difference Between Increasing Elements
 */

// @lc code=start
class Solution {
    public int maximumDifference(int[] nums) {
        int result = -1;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            min = Math.min(min, nums[i]);
            if (nums[i] > min) {
                result = Math.max(result, nums[i] - min);
            }
        }
        return result;
    }
}
// @lc code=end

