// Last updated: 11/20/2025, 2:36:00 AM
class Solution {
    public boolean isValid(String s) {
        Stack <Character> stack = new Stack<>();

        char[] letters = s.toCharArray();

        for(char c : letters ){
            if ( c == ')') {
                if ( stack.isEmpty() || stack.pop() != '(' ) {
                    return false;
                }
            }
            else if ( c == '}'){
                if ( stack.isEmpty() || stack.pop() != '{' ) {
                    return false;
                }
            }
            else if ( c == ']') {
                if ( stack.isEmpty() || stack.pop() != '[' ) {
                    return false;
                }
            }
            else stack.push(c);
        }

        return stack.isEmpty();

    }
}