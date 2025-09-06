/*
 * @lc app=leetcode id=1423 lang=java
 *
 * [1423] Maximum Points You Can Obtain from Cards
 */

// @lc code=start
class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int maxScore = 0;
        
        for (int leftCount = 0; leftCount <= k; leftCount++) {
            int rightCount = k - leftCount;
            int currentScore = 0;
            
            for (int i = 0; i < leftCount; i++) {
                currentScore += cardPoints[i];
            }
            
            for (int i = 0; i < rightCount; i++) {
                currentScore += cardPoints[n - 1 - i];
            }
            
            maxScore = Math.max(maxScore, currentScore);
        }
        
        return maxScore;
    }
}

// @lc code=end

