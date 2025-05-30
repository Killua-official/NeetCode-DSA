package stack;

import java.util.ArrayList;

/**
 * LeetCode #20 - https://leetcode.com/problems/valid-parentheses/
 *
 * Checks if a string has valid parentheses.
 */

public class ValidParentheses {
    public boolean isValid(String s) {
        ArrayList<Character> stack = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '{' || c == '[') {
                stack.add(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.remove(stack.size() - 1);

                if (c == ')' && top != '(') {
                    return false;
                } else if (c == '}' && top != '{') {
                    return false;
                } else if (c == ']' && top != '[') {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
