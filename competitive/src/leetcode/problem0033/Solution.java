package leetcode.problem0033;

import static java.lang.Math.*;

public class Solution {
    public int searchInsert(int[] nums, int target) {
        if (target < nums[0]) {
            return 0;
        }
        int ok = nums.length;
        int ng = -1;
        while (abs(ok - ng) > 1) {
            int mid = (ok + ng) / 2;
            if (nums[mid] >= target) {
                ok = mid;
            } else {
                ng = mid;
            }
        }

        return ok;
    }
}
