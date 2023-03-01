package leetcode.problem0217;

import java.util.Map;
import java.util.HashMap;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
        for (int num: nums) {
            if (mp.containsKey(num)) {
                return true;
            } else {
                mp.put(num, 1);
            }
        }

        return false;
    }
}
