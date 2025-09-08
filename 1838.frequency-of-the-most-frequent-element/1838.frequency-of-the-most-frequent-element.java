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

        int maxFrequency = 1;
        for (int target = nums.length - 1; target > 0; target--) {
            int currK = k;
            int currFrequency = 1;
            for (int left = target - 1; left >= 0; left--) {
                if (currK - (nums[target] - nums[left]) >= 0) {
                    currFrequency++;
                    currK -= (nums[target] - nums[left]);
                } else {
                    break;
                }
            }
            maxFrequency = Math.max(maxFrequency, currFrequency);
            if (target + 1 < maxFrequency) {
                return maxFrequency;
            }
        }
        return maxFrequency;
    }
}
// @lc code=end

