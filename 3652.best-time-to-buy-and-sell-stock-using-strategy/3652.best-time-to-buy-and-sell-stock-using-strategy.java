/*
 * @lc app=leetcode id=3652 lang=java
 *
 * [3652] Best Time to Buy and Sell Stock using Strategy
 */

// @lc code=start
class Solution {
    public long maxProfit(int[] prices, int[] strategy, int k) {
        long maxProfit = 0;
        long windowProfitChange = 0;
        long maxWindowChange = 0;

        for (int i = 0; i < k; i++) {
            maxProfit += prices[i] * strategy[i];
            if (i < k / 2 && strategy[i] != 0) {
                windowProfitChange += (long)0 - strategy[i] * prices[i];
            } else if (i >= k / 2 && strategy[i] != 1) {
                windowProfitChange += (long)prices[i] - (prices[i] * strategy[i]);
            }
        }
        maxWindowChange = Math.max(windowProfitChange, maxWindowChange);

        for (int i = k; i < prices.length; i++) {
            maxProfit += prices[i] * strategy[i];
            if (strategy[i] != 1) {
                windowProfitChange += (long)prices[i] - (prices[i] * strategy[i]);
            }
            if (strategy[i - k] != 0) {
                windowProfitChange -= (long)0 - strategy[i - k] * prices[i - k];
            }
            windowProfitChange -= prices[i - k / 2];
            maxWindowChange = Math.max(maxWindowChange, windowProfitChange);
        }
        return maxProfit + maxWindowChange;
    }
}
// @lc code=end

