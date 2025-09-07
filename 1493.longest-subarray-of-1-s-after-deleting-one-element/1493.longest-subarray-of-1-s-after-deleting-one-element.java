/*
 * @lc app=leetcode id=1493 lang=java
 *
 * [1493] Longest Subarray of 1's After Deleting One Element
 */

// @lc code=start
class Solution {
    public int longestSubarray(int[] nums) {
       int maxWin = 0;
       int currWin = 0;
       int left = 0;
       int zeroCount = 0;

       for (int right = 0; right < nums.length; right++) {
        if (nums[right] == 0) {
            zeroCount++;
        }
        while (zeroCount >= 2)  {
            if (nums[left] == 0) {
                zeroCount--;
            }
            left++;
        }
        currWin = right - left;
        maxWin = Math.max(maxWin, currWin);
       }
       return maxWin;
    }
}
// @lc code=end

