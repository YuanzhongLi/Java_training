package leetcode.problem0020;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> mp = new HashMap<>();
        mp.put(')', '(');
        mp.put('}', '{');
        mp.put(']', '[');

        Deque<Character> stack = new ArrayDeque<>();
        for (char ch : s.toCharArray()) {
            if ((ch == '(') || (ch == '{') || (ch == '[')) {
                stack.push(Character.valueOf(ch));
            } else {
                if (stack.size() == 0) {
                    return false;
                }
                if (!stack.pop().equals(mp.get(Character.valueOf(ch)))) {
                    return false;
                }
            }
        }

        return stack.size() == 0;
    }
}
