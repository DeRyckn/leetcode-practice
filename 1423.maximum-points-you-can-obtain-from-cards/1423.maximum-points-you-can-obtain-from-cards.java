/*
 * @lc app=leetcode id=1423 lang=java
 *
 * [1423] Maximum Points You Can Obtain from Cards
 */

// @lc code=start
class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int sumScore = 0;
        int minScore = 0;
        int totalScore = 0;

        for(int i = 0; i < n - k; i++) {
            sumScore += cardPoints[i];
        }
        minScore = sumScore;
        
        for (int i = n - k; i < n; i++) {
            sumScore = sumScore - cardPoints[i - n + k] + cardPoints[i];
            minScore = Math.min(minScore, sumScore);
        }
        for (int i = 0; i < n; i++) {
            totalScore += cardPoints[i];
        }
        return totalScore - minScore;
    }
}
// @lc code=end

