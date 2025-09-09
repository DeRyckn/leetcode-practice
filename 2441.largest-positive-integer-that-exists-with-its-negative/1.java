/*
 * @lc app=leetcode id=2441 lang=java
 *
 * [2441] Largest Positive Integer That Exists With Its Negative
 */

// @lc code=start

import java.util.HashSet;

class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] < 0) {
                return -1;
            }
            if (set.contains(-1 * nums[i])) {
                return nums[i];
            }
        }
        return -1;
    }
}
// @lc code=end

