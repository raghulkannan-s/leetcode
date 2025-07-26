// Last updated: 7/26/2025, 9:50:45 PM
// stack in java


class Solution {
    public boolean isValid(String s) {
        if ( s.length() %2 != 0) return false;

        Stack<Character> stack = new Stack<>();
        Map<Character, Character> close = new HashMap<>();
        
        close.put( '}' , '{');
        close.put( ']' , '[');
        close.put( ')' , '(');

        for ( char c : s.toCharArray() ){
            if( close.containsKey(c) ){

                if( stack.isEmpty() || stack.peek() != close.get(c) ){
                    return false;
                }

                stack.pop();
            }
            else{
                stack.push(c);
            }  
        }

        return stack.isEmpty();
        
    }
}
