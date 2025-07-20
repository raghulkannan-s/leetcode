// Last updated: 7/20/2025, 11:58:43 PM
// switched from Python to Java
import java.util.*;

class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;

        Stack<Character> stack = new Stack<>();
        Map<Character, Character> closeBrackets = new HashMap<>();
        closeBrackets.put(')', '(');
        closeBrackets.put(']', '[');
        closeBrackets.put('}', '{');

        for (char ch : s.toCharArray()) {
            if (closeBrackets.containsKey(ch)) {
                if (stack.isEmpty() || stack.peek() != closeBrackets.get(ch)) {
                    return false;
                }
                stack.pop();
            } else {
                stack.push(ch);
            }
        }

        return stack.isEmpty();
    }
}
