/*
 * @lc app=leetcode id=1456 lang=java
 *
 * [1456] Maximum Number of Vowels in a Substring of Given Length
 */

// @lc code=start
class Solution {
    public int maxVowels(String s, int k) {
        int maxCount = 0;
        int currentCount = 0;

        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                currentCount++;
            }
        }
        maxCount = currentCount;

        for (int i = k; i < s.length(); i++) {
            if (isVowel(s.charAt(i - k))) {
                currentCount--;
            }
            if (isVowel(s.charAt(i))) {
                currentCount++;
            }
            if (currentCount == k) {
                return k;
            }
            maxCount = Math.max(maxCount, currentCount);
        }
        return maxCount;
    }

    public boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
// @lc code=end

