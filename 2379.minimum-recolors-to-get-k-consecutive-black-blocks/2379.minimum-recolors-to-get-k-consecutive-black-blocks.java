/*
 * @lc app=leetcode id=2379 lang=java
 *
 * [2379] Minimum Recolors to Get K Consecutive Black Blocks
 */

// @lc code=start
class Solution {
    public int minimumRecolors(String blocks, int k) {
        int maxNumOfB = 0; 
        int currWindowOfB = 0;
        for (int i = 0; i < k; i++) {
            if (blocks.charAt(i) == 'B') {
                currWindowOfB++;
            }
        }
        maxNumOfB = Math.max(maxNumOfB, currWindowOfB);

        for (int i = k; i < blocks.length(); i++) {
            if (blocks.charAt(i - k) == 'B') {
                currWindowOfB--;
            }
            if (blocks.charAt(i) == 'B') {
                currWindowOfB++;
            }
            maxNumOfB = Math.max(maxNumOfB, currWindowOfB);
        }
        return k - maxNumOfB;
    }
}
// @lc code=end

