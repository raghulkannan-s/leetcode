// Last updated: 3/22/2026, 10:57:53 PM
1class Solution {
2    public int minFallingPathSum(int[][] matrix) {
3        
4        int n = matrix.length;
5        int m = matrix[0].length;
6
7        int[][] dp = new int[n][m];
8        
9        int res = Integer.MAX_VALUE;
10
11        for (int j = 0; j < m; j++) {
12            dp[n-1][j] = matrix[n-1][j];
13        }
14
15        for (int i = n-2; i >= 0; i--) {
16            for (int j = 0; j < m; j++) {
17                int down = dp[i+1][j];
18                int downLeft = j-1 >= 0 ? dp[i+1][j-1] : (int)1e9;
19                int downRight = j+1 < m ? dp[i+1][j+1] : (int)1e9;
20                
21                dp[i][j] = matrix[i][j] + Math.min(down, Math.min(downLeft, downRight));
22            }
23        }
24
25        for (int j = 0; j < m; j++) {
26            res = Math.min(res, dp[0][j]);
27        }
28
29        return res;
30    }
31
32}