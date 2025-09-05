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

        for (int i = 0; i < k; i++) {
            currentSum += arr[i];
        }
        if (currentSum >= threshold * k) {
            result++;
        }

        for (int i = k; i < arr.length; i++) {
            currentSum = currentSum - arr[i - k] + arr[i];
            if (currentSum >= threshold * k) {
                result++;
            }
        }
        return result;
    }
}
// @lc code=end

