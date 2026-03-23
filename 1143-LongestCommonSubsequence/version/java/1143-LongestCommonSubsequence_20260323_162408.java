// Last updated: 3/23/2026, 4:24:08 PM
1class Solution {
2    public int longestCommonSubsequence(String a, String b) {
3
4        char[] t1 = a.toCharArray();
5        char[] t2 = b.toCharArray();
6
7        int m = t1.length;
8        int n = t2.length;
9
10        int[][] dp = new int[t1.length+1][t2.length+1];
11
12        for( int i = 1; i <= m; i++ ){
13            for( int j = 1; j <= n; j++ ){
14
15                if( t1[i-1] == t2[j-1] ){
16                    dp[i][j] = dp[i-1][j-1]+1;
17                }
18                else{
19                    int skip1 = dp[i-1][j];
20                    int skip2 = dp[i][j-1];
21
22                    dp[i][j] = Math.max( skip1, skip2 );
23                }
24            }
25        }
26
27        return dp[m][n];
28
29    }
30}