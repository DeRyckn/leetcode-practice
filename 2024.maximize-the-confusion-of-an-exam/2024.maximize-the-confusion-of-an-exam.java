/*
 * @lc app=leetcode id=2024 lang=java
 *
 * [2024] Maximize the Confusion of an Exam
 */

// @lc code=start
class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
       int left = 0;
       int tCount = 0;
       int fCount = 0;
       int maxNum = 0;
       
       for (int right = 0; right < answerKey.length(); right++) {
        if (answerKey.charAt(right) == 'T') {
            tCount++;
        } else {
            fCount++;
        }
        while (fCount > k && tCount > k) {
            if (answerKey.charAt(left) == 'T') {
                tCount--;
            }
            if (answerKey.charAt(left) == 'F') {
                fCount--;
            }
            left++;
        }
        maxNum = Math.max(maxNum, right - left + 1);
       }
        return maxNum;
    }
}
// @lc code=end

