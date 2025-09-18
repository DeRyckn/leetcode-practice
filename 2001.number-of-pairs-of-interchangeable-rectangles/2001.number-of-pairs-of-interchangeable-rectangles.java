/*
 * @lc app=leetcode id=2001 lang=java
 *
 * [2001] Number of Pairs of Interchangeable Rectangles
 */

// @lc code=start
class Solution {
    public long interchangeableRectangles(int[][] rectangles) {
        HashMap<Double, Integer> count = new HashMap<>();
        long result = 0;

        for (int i = 0; i < rectangles.length; i++) {
            double ratio = (double)rectangles[i][0] / rectangles[i][1];
            if (count.get(ratio) == null) {
                count.put(ratio, 1);
            } else {
                result += count.get(ratio);
                count.put(ratio, count.get(ratio) + 1);
            }
        }
        return result;
    }
}
// @lc code=end

