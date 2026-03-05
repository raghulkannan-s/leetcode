// Last updated: 3/5/2026, 5:05:40 PM
1class Solution {
2    public int uniquePaths(int m, int n) {
3
4        int[][] dp = new int[m][n];
5        
6
7        for( int i = 0; i < m; i++ ){
8            for( int j = 0; j<n; j++ ){
9                if( i == 0 || j ==0 ){
10                    dp[i][j] = 1;
11                }else{
12                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
13                }
14            }
15        }
16
17        return dp[m-1][n-1];
18
19
20    }
21}