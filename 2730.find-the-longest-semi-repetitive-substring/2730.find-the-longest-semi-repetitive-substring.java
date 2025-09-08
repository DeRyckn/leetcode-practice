/*
 * @lc app=leetcode id=2730 lang=java
 *
 * [2730] Find the Longest Semi-Repetitive Substring
 */

// @lc code=start
class Solution {
    public int longestSemiRepetitiveSubstring(String s) {
        int length = 0;
        int n = s.length();
        int left = 0;
        int samePair = 0;

        if (n < 2) {
            return 1;
        }
        
        for (int right = 1; right < n; right++) {
            boolean isPair = false;
            if (s.charAt(right) == s.charAt(right - 1) && !isPair) {
                samePair++;
                isPair = true;
            }
            while (samePair > 1) {
                if (s.charAt(left) == s.charAt(left + 1)) {
                    samePair--;
                }
                left++;
            }
            length = Math.max(length, right - left + 1);
        }
        return length;
    }
}
// @lc code=end

