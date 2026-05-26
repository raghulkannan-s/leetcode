// Last updated: 5/26/2026, 11:53:58 AM
1class Solution {
2    public String removeOuterParentheses(String s) {
3        
4        StringBuilder sb = new StringBuilder();
5
6        int n = s.length();
7        int open = 0;
8
9        for( char ch : s.toCharArray() ){
10            if( ch == '(' ){
11                if( open > 0 ) sb.append( ch );
12                open++;
13            }
14            else if( ch == ')' ){
15                open--;
16                if( open > 0 ) sb.append( ch );
17            }    
18        }
19
20        return sb.toString();
21        
22
23    }
24}