/*
 * @lc app=leetcode id=904 lang=java
 *
 * [904] Fruit Into Baskets
 */

// @lc code=start
class Solution {
    public int totalFruit(int[] fruits) {
        int maxFruits = 0;
        int left = 0;
        int type1 = -1;
        int type2 = -1;
        int type1Num = 0;
        int type2Num = 0;
        
        for (int right = 0; right < fruits.length; right++) {
            if (type1 == -1) {
                type1 = fruits[right];
                type1Num++;
            } else if (type2 == -1 && fruits[right] != type1) {
                type2 = fruits[right];
                type2Num++;
            }else if (fruits[right] == type1) {
                type1Num++;
            }else if (fruits[right] == type2) {
                type2Num++;
            } else if (fruits[right] != type1 && fruits[right] != type2) {
                while (type1Num != 0 && type2Num != 0) {
                    if (fruits[left] == type1) {
                        type1Num--;
                    }
                    if (fruits[left] == type2) {
                        type2Num--;
                    }
                    left++;
                }
                if (type1Num == 0) {
                    type1 = fruits[right];
                    type1Num = 1;
                } else {
                    type2 = fruits[right];
                    type2Num = 1;
                }

            }
            
            maxFruits = Math.max(maxFruits, right - left + 1);
        }
        return maxFruits;
    }
}
// @lc code=end

