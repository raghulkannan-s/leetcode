// Last updated: 5/26/2026, 11:16:43 AM
1class Solution {
2    public int maxDepth(String s) {
3        
4        int n = s.length();
5
6        int curr = 0;
7        int res = 0;
8
9        Stack<Character> st = new Stack<>();
10
11        for( int i = 0; i < n; i++ ){
12            char currChar = s.charAt(i);
13
14            if( currChar == '(' ){
15                st.push(currChar);
16                curr++;
17            }
18            else if( currChar == ')' ){
19                st.pop();
20                res = Math.max( res, curr );
21                curr--;
22            }
23        }
24
25        return res;
26
27    }
28}