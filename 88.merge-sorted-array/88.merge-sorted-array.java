/*
 * @lc app=leetcode id=88 lang=java
 *
 * [88] Merge Sorted Array
 */

// @lc code=start
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int a = m - 1;
        int b = n - 1;
        for (int i = m + n - 1; i >= 0; i--) {
            if (a >= 0 && b >= 0) {
                if (nums1[a] >= nums2[b]) {
                    nums1[i] = nums1[a--];
                } else {
                    nums1[i] = nums2[b--];
                }
            } else if (a >= 0) {
                nums1[i] = nums1[a--];
            } else if (b >= 0) {
                nums1[i] = nums2[b--];
            }
        }
    }
}
// @lc code=end

