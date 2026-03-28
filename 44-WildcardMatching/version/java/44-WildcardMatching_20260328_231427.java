// Last updated: 3/28/2026, 11:14:27 PM
1class Solution {
2    public boolean isMatch(String s, String p) {
3
4        int n = s.length();
5        int m = p.length();
6
7        boolean[] prev = new boolean[m+1];
8        prev[0] = true;
9
10        for( int i = 1; i < m+1; i++ ){
11            if( p.charAt(i-1) == '*' ){
12                prev[i] = prev[i-1];
13            }
14        }
15
16        for( int i = 1; i<n+1; i++ ){
17
18            boolean[] curr = new boolean[m+1];
19
20            for( int j = 1; j<m+1; j++ ){
21
22                if( s.charAt(i-1) == p.charAt(j-1) || p.charAt(j-1) == '?' ){
23                    curr[j] = prev[j-1];
24                }
25                else if ( p.charAt(j-1) == '*' ){
26                    curr[j] = prev[j] || curr[j-1];
27                }
28
29            }
30            prev = curr;
31        }
32
33        return prev[m];
34    }
35}