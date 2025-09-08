/*
 * @lc app=leetcode id=1004 lang=java
 *
 * [1004] Max Consecutive Ones III
 */

// @lc code=start
class Solution {
    public int longestOnes(int[] nums, int k) {
        int result = 0;
        int n = nums.length;
        int left = 0;
        int zeroCount = 0;

        for (int right = 0; right < n; right++) {
            if (nums[right] == 0 && zeroCount <= k) {
                zeroCount++;
            }
            while (zeroCount > k) {
                if (nums[left] == 0) {
                    zeroCount--;
                } 
                left++;
            }
            result = Math.max(result, right - left + 1);
        }
        return result;
    }
}
// @lc code=end

