/*
 * @lc app=leetcode id=1052 lang=java
 *
 * [1052] Grumpy Bookstore Owner
 */

// @lc code=start
class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int max = 0;
        int maxWindow = 0;
        int curWindow = 0; 

        for (int i = 0; i < minutes; i++) {
            if (grumpy[i] == 1) {
                curWindow += customers[i];
            } else {
                max += customers[i];
            }
        }
        maxWindow = curWindow;

        for (int i = minutes; i < customers.length; i++) {
            if (grumpy[i] == 1) {
                curWindow += customers[i];
            } else {
                max += customers[i];
            }
            if (grumpy[i - minutes] == 1) {
                curWindow -= customers[i - minutes];
            }
            maxWindow = Math.max(curWindow, maxWindow);
        }
        max += maxWindow;
        return max;
    }
}
// @lc code=end

