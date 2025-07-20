// Last updated: 7/21/2025, 3:07:53 AM
import java.util.*;

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
