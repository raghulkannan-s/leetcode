// Last updated: 3/23/2026, 4:53:21 PM
1class Solution {
2    public int minFallingPathSum(int[][] matrix) {
3        
4        int n = matrix.length;
5        int m = matrix[0].length;
6
7        int inf = (int) 1e9;
8
9        int[][] dp = new int[n][m];
10        for( int i = 0; i<m; i++ ) dp[0][i] = matrix[0][i];
11
12        for( int i = 1; i < n; i++  ){
13            for( int j = 0; j < m; j++ ){
14                
15                int left = ( j > 0 )? dp[i-1][j-1] : inf;
16                int right = ( j < m-1 )? dp[i-1][j+1] : inf;
17                int center = dp[i-1][j];
18
19                dp[i][j] = matrix[i][j] + Math.min( center, Math.min(left, right) );
20            }
21        }
22
23        int res = inf;
24        for( int i = 0; i<m; i++ ){
25            res = Math.min( res, dp[n-1][i] );
26        }
27
28        return res;
29    }
30
31}