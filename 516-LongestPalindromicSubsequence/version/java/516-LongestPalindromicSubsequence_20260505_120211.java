// Last updated: 5/5/2026, 12:02:11 PM
1class Solution {
2    public int longestPalindromeSubseq(String s) {
3        
4        StringBuilder temp = new StringBuilder(s);
5        String r = temp.reverse().toString();
6
7        int n = s.length();
8        int m = r.length();
9
10        int[][] dp = new int[n+1][m+1];
11
12        for( int i = 1; i<=n; i++ ){
13            for( int j = 1; j<=m; j++ ){
14                if( s.charAt(i-1) == r.charAt(j-1) ){
15                    dp[i][j] = 1 + dp[i-1][j-1];
16                }else{
17                    dp[i][j] = Math.max( dp[i-1][j], dp[i][j-1] );
18                }
19            }
20        }
21
22        return dp[n][m];
23
24    }
25}