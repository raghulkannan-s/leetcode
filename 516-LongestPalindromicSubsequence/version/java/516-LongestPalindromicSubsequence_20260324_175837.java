// Last updated: 3/24/2026, 5:58:37 PM
1class Solution {
2    public int longestPalindromeSubseq(String s) {
3        
4        StringBuilder temp = new StringBuilder(s);
5        String r = temp.reverse().toString();
6
7        int n = s.length();
8        int m = r.length();
9
10        int[] prev = new int[m+1];
11
12        for( int i = 1; i<=n; i++ ){
13            int[] curr = new int[m+1];
14            for( int j = 1; j<=m; j++ ){
15                if( s.charAt(i-1) == r.charAt(j-1) ){
16                    curr[j] = 1 + prev[j-1];
17                }else{
18                    curr[j] = Math.max( prev[j], curr[j-1] );
19                }
20            }
21            prev = curr;
22        }
23
24        return prev[m];
25
26    }
27}