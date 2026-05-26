// Last updated: 5/26/2026, 11:41:25 AM
1class Solution {
2    public int maxDepth(String s) {
3        
4        int n = s.length();
5
6        int curr = 0;
7        int res = 0;
8
9        for( int i = 0; i < n; i++ ){
10            char currChar = s.charAt(i);
11
12            if( currChar == '(' ){
13                curr++;
14            }
15            else if( currChar == ')' ){
16                res = Math.max( res, curr );
17                curr--;
18            }
19        }
20
21        return res;
22
23    }
24}