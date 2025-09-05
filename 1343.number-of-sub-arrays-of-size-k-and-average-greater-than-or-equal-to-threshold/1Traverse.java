/*
 * @lc app=leetcode id=1343 lang=java
 *
 * [1343] Number of Sub-arrays of Size K and Average Greater than or Equal to Threshold
 */

// @lc code=start
class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int result = 0;
        int currentSum = 0;

        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];

            if (i >= k - 1) {
                if (currentSum >= threshold * k) {
                    result++;
                }
                currentSum -= arr[i - k + 1];
            }
        }
        return result;
    }
}
// @lc code=end

