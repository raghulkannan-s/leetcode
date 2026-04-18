// Last updated: 4/18/2026, 4:49:10 PM
1class Solution {
2    public boolean isValid(String s) {
3        
4        char[] b = s.toCharArray();
5        Stack<Character> st = new Stack<>();
6
7        for( char c : b ){
8
9            if( c == '{' || c == '(' || c == '[' ) st.push(c);
10            else {
11                if( st.isEmpty() ) return false;
12                char check = st.pop();
13                if ( check == '{' && c == '}') continue;
14                else if ( check == '[' && c == ']') continue;
15                else if ( check == '(' && c == ')') continue;
16                else return false;
17            }
18        }
19        return st.isEmpty();
20    }
21}