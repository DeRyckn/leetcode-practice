/*
 * @lc app=leetcode id=1128 lang=java
 *
 * [1128] Number of Equivalent Domino Pairs
 */

// @lc code=start
class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
       int[][] count = new int[10][10];
       int result = 0;

       for (int[] domino : dominoes) {
        int min = Math.min(domino[0], domino[1]);
        int max = Math.max(domino[0], domino[1]);
        count[min][max]++;
       }

       for (int i = 0; i < 10; i++) {
        for (int j = 0; j < 10; j++) {
            result += count[i][j] * (count[i][j] - 1) / 2;
        }
       }
       return result;
    }
}
// @lc code=end

