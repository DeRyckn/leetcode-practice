/*
 * @lc app=leetcode id=1512 lang=java
 *
 * [1512] Number of Good Pairs
 */

// @lc code=start

import java.util.HashMap;

class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> count = new HashMap<>();
        int pairsCount = 0;
        for (int num : nums) {
            pairsCount += count.getOrDefault(num, 0);
            count.put(num, count.getOrDefault(num, 0) + 1);
        }
        return pairsCount;
    }
}
// @lc code=end

