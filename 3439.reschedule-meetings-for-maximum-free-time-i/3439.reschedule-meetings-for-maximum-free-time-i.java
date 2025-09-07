/*
 * @lc app=leetcode id=3439 lang=java
 *
 * [3439] Reschedule Meetings for Maximum Free Time I
 */

// @lc code=start
class Solution {
    public int maxFreeTime(int eventTime, int k, int[] startTime, int[] endTime) {
        int n = startTime.length;
        int[] timeLot = new int[n + 1];
        timeLot[0] = startTime[0];
        timeLot[n] = eventTime - endTime[n - 1];
        for (int i = 1; i < n; i++) {
            timeLot[i] = startTime[i] - endTime[i - 1];
        }

        int maxFreeTime = 0;
        int windowFreeTime = 0;
        for (int i = 0; i < k + 1; i++) {
            windowFreeTime += timeLot[i];
        }
        maxFreeTime = windowFreeTime;
        for (int i = k + 1; i < n + 1; i++) {
            windowFreeTime = windowFreeTime + timeLot[i] - timeLot[i - k - 1];
            maxFreeTime = Math.max(maxFreeTime, windowFreeTime);
        }
        return maxFreeTime;
    }
}
// @lc code=end

