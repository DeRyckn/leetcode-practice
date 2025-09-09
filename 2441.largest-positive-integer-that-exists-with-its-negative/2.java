/*
 * @lc app=leetcode id=2441 lang=java
 *
 * [2441] Largest Positive Integer That Exists With Its Negative
 */

// @lc code=start

import java.util.HashSet;

class Solution {
    public int findMaxK(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int ans = -1;
        for (int num : nums) {
            int absNum = Math.abs(num);
            if (absNum > ans && set.contains(-num)) {
                ans = absNum;
            }
            set.add(num);
        }
        return ans;
    }
}
// @lc code=end

