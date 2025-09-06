/*
 * @lc app=leetcode id=1574 lang=java
 *
 * [1574] Shortest Subarray to be Removed to Make Array Sorted
 */

// @lc code=start
class Solution {
    public int findLengthOfShortestSubarray(int[] arr) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        while (left + 1< n && arr[left] <= arr[left + 1]) {
            left++;
        }
        if (left == n - 1) {
            return 0;
        }
        while (right > 0 && arr[right] >= arr[right - 1]) {
            right--;
        }

        int result = Math.min(n - left - 1, right);
        
        int i = 0; 
        int j = right; 
        while (i <= left && j < n) {
            if (arr[i] <= arr[j]) {
                result = Math.min(result, j - i - 1);
                i++;
            } else {
                j++;
            }
        }
        return result;
    }
}
// @lc code=end


