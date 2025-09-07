/*
 * @lc app=leetcode id=3634 lang=java
 *
 * [3634] Minimum Removals to Balance Array
 */

// @lc code=start
class Solution {
    public int minRemoval(int[] nums, int k) {
        int validCount = 0;
        int maxValidCount = 1;
        int n = nums.length;
        int right = 0;

        Arrays.sort(nums);
        
        if (n == 1) {
            return 0;
        }
        for (int left = 0; left < n - 1; left++) {
            right = left + 1;
            if (nums[left] * k >= nums[right]) {
                while (right < n && (long)nums[left] * k >= (long)nums[right]) {
                    right++;
                }
                validCount = right - left;
                maxValidCount = Math.max(maxValidCount, validCount);
            }
        }
        return n - maxValidCount;
    }
}
// @lc code=end

