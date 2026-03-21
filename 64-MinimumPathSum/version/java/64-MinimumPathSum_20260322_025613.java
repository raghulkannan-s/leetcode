// Last updated: 3/22/2026, 2:56:13 AM
1class Solution {
2    public int minPathSum(int[][] grid) {
3
4        int m = grid[0].length;
5        int n = grid.length;
6
7        int[][] dp = new int[n][m];
8        dp[0][0] = grid[0][0];
9
10        for( int i = 0; i < n; i++ ){
11            for( int j = 0; j<m; j++ ){
12                if( i == 0 && j == 0 ) dp[i][j] = grid[0][0];
13                else if( i == 0 ) dp[i][j] = grid[i][j] + dp[i][j-1];
14                else if( j == 0 ) dp[i][j] = grid[i][j] + dp[i-1][j];
15                else{
16                    int up = dp[i-1][j];
17                    int left = dp[i][j-1];
18                    dp[i][j] = grid[i][j] + Math.min( left, up );
19                }
20            }
21        }
22
23
24        return dp[n-1][m-1];
25
26    }
27
28}