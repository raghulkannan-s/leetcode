// Last updated: 3/22/2026, 2:55:13 AM
1class Solution {
2    public int minPathSum(int[][] grid) {
3
4        int m = grid[0].length;
5        int n = grid.length;
6
7        int[][] dp = new int[n][m];
8        for( int[] arr : dp ) Arrays.fill(arr, -1);
9        dp[0][0] = grid[0][0];
10
11        for( int i = 0; i < n; i++ ){
12            for( int j = 0; j<m; j++ ){
13                if( i == 0 && j == 0 ) dp[i][j] = grid[0][0];
14                else if( i == 0 ) dp[i][j] = grid[i][j] + dp[i][j-1];
15                else if( j == 0 ) dp[i][j] = grid[i][j] + dp[i-1][j];
16                else{
17                    int up = dp[i-1][j];
18                    int left = dp[i][j-1];
19                    dp[i][j] = grid[i][j] + Math.min( left, up );
20                }
21            }
22        }
23
24
25        return dp[n-1][m-1];
26
27    }
28
29}