/*
 * @lc app=leetcode id=1658 lang=java
 *
 * [1658] Minimum Operations to Reduce X to Zero
 */

// @lc code=start
class Solution {
    public int minOperations(int[] nums, int x) {
        long total = 0;
        long windowSum = 0;
        int n = nums.length;
        int left = 0;
        int maxLen = -1;

        for (int i = 0; i < n; i++) {
            total += nums[i];
        }
        long target = total - x;
        if (target < 0) {
            return -1;
        }
        if (target == 0) {
            return n;
        }
        
        for (int right = 0; right < n; right++) {
            windowSum += nums[right];
            
            while (windowSum > target && left <= right) {
                windowSum -= nums[left];
                left++;
            }

            if (windowSum == target) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
        }
        return maxLen == -1 ? -1 : n - maxLen;

    }
}
// @lc code=end

