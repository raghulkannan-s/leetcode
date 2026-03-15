// Last updated: 3/15/2026, 12:53:24 PM
1class Solution {
2    public boolean isSubsequence(String s, String t) {
3        int n = s.length();
4        int m = t.length();
5        
6        boolean[] test = new boolean[n];
7
8        if( n == 0 ) return true;
9
10        int idx = 0;
11        char check = s.charAt(idx);
12
13        for( int i = 0; i<m; i++){
14
15            if( t.charAt(i) == check ){
16                test[idx] = true;
17                if( idx < n-1 ){
18                    idx++;
19                    check = s.charAt(idx);
20                }
21            }
22        }
23
24        for( boolean j : test ){
25            if( j == false ) return false;
26        }
27        return true;
28
29    }
30}