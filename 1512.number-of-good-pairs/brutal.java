/*
 * @lc app=leetcode id=1512 lang=java
 *
 * [1512] Number of Good Pairs
 */

// @lc code=start
class Solution {
    public int numIdenticalPairs(int[] nums) {
       int pairsCount = 0;
       for (int i = 0; i < nums.length; i++) {
        for (int j = i + 1; j < nums.length; j++) {
            if (nums[j] == nums[i]) {
                pairsCount++;
            }
        }
       } 
       return pairsCount;
    }
}
// @lc code=end

