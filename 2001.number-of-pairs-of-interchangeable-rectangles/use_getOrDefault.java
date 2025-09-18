/*
 * @lc app=leetcode id=2001 lang=java
 *
 * [2001] Number of Pairs of Interchangeable Rectangles
 */

// @lc code=start

import java.util.HashMap;

class Solution {
    public long interchangeableRectangles(int[][] rectangles) {
        HashMap<Double, Integer> count = new HashMap<>();
        long result = 0;

        for (int i = 0; i < rectangles.length; i++) {
            double ratio = (double)rectangles[i][0] / rectangles[i][1];
            int prev = count.getOrDefault(ratio, 0);
            result += prev;
            count.put(ratio, prev + 1);
        }
        return result;
    }
}
// @lc code=end

