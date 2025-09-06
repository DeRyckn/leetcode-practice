/*
 * @lc app=leetcode id=2090 lang=java
 *
 * [2090] K Radius Subarray Averages
 */

// @lc code=start
class Solution {
    public int[] getAverages(int[] nums, int k) {
        int length = nums.length;
        int[] average = new int[length];
        long currentSum = 0;

        for (int i = 0; i < length; i++) {
            currentSum += nums[i];

            if (i < k || i > length - k - 1) {
                average[i] = -1;
            }
            if (i >= 2 * k) {
                average[i - k] = (int)(currentSum / (k + k + 1));
                currentSum -= nums[i - k - k];
            }
        }
        return average;
    }
}
// @lc code=end

