// Last updated: 5/5/2026, 6:01:57 PM
1class Solution {
2    public int longestPalindromeSubseq(String s) {
3
4        StringBuilder sb = new StringBuilder(s);
5        String r = sb.reverse().toString();
6
7        int n = s.length();
8        int[][] dp = new int[n+1][n+1];
9
10        for( int i = 1; i<=n; i++ ){
11            for( int j = 1; j<=n; j++ ){
12                if( s.charAt(i-1) == r.charAt(j-1) ){
13                    dp[i][j] = 1 + dp[i-1][j-1];
14                }
15                else{
16                    dp[i][j] = Math.max( dp[i][j-1], dp[i-1][j] );
17                }
18            }
19        }
20        return dp[n][n];
21    }
22}