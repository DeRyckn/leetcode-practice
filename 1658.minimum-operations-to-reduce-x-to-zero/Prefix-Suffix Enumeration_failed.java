/*
 * @lc app=leetcode id=1658 lang=java
 *
 * [1658] Minimum Operations to Reduce X to Zero
 */

// @lc code=start
class Solution {
    public int minOperations(int[] nums, int x) {
        long operation = Integer.MAX_VALUE;
        long num = x;
        int right = nums.length - 1;
        int n = nums.length;

        if (num == 0) {
            return 0;
        }

        for (int i = n - 1; i >= 0; i--) {
            num -= nums[i];
            if (num == 0) {
                operation = Math.min(operation, n - i);
                num = x;
                break;
            }else if (num < 0) {
                num = x;
                break;
            }
        }

        num = x;
        for (int left = 0; left < n; left++) {
            num -= nums[left];

            if (num == 0) {
                operation = Math.min(operation, left + 1);
            } else if (num < 0) {
                break;
            }

            long tempNum = num;
            while (tempNum > 0 && right > left) {
                tempNum -= nums[right];
                if (tempNum == 0) {
                    operation = Math.min(operation, left + 1 + (n - right));
                } else if (tempNum < 0) {
                    break;
                }
                right--;
            }
            right = nums.length - 1;
        }    
        if (operation == Integer.MAX_VALUE) {
            return -1;
        }
        return (int)operation;
    }
}
// @lc code=end

