/*
 * @lc app=leetcode id=1128 lang=java
 *
 * [1128] Number of Equivalent Domino Pairs
 */

// @lc code=start

import java.util.HashMap;

class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        HashMap<Integer, Integer>map = new HashMap<>();
        int result = 0;

        for(int[] donimo : dominoes) {
            int min = Math.min(donimo[0], donimo[1]);
            int max = Math.max(donimo[0], donimo[1]);

            int key = min * 10 + max;
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        for (int count : map.values()) {
            result += count * (count - 1) / 2;
        }
        return result;
    }
}
// @lc code=end

