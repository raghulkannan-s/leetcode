// Last updated: 3/23/2026, 4:50:38 PM
1class Solution {
2    public int minFallingPathSum(int[][] matrix) {
3        
4        int n = matrix.length;
5        int m = matrix[0].length;
6
7        int inf = (int) 1e9;
8
9        int[][] dp = new int[n][m];
10
11        for( int[] arr : dp ) Arrays.fill( arr, inf );
12        
13        for( int i = 0; i<m; i++ ) dp[0][i] = matrix[0][i];
14
15        for( int i = 1; i < n; i++  ){
16            for( int j = 0; j < m; j++ ){
17                
18                int left = ( j > 0 )? dp[i-1][j-1] : inf;
19                int right = ( j < m-1 )? dp[i-1][j+1] : inf;
20                int center = dp[i-1][j];
21
22                dp[i][j] = matrix[i][j] + Math.min( center, Math.min(left, right) );
23            }
24        }
25
26        int res = inf;
27        for( int i = 0; i<m; i++ ){
28            res = Math.min( res, dp[n-1][i] );
29        }
30
31        return res;
32    }
33
34}