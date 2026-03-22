// Last updated: 3/22/2026, 10:57:08 PM
1class Solution {
2    public int minFallingPathSum(int[][] matrix) {
3        
4        int n = matrix.length;
5        int m = matrix[0].length;
6
7        int[][] dp = new int[n][m];
8        for( int[] arr : dp ){
9            Arrays.fill( arr, (int) 1e9 );
10        }
11        int res = Integer.MAX_VALUE;
12
13        for (int j = 0; j < m; j++) {
14            dp[n-1][j] = matrix[n-1][j];
15        }
16
17        for (int i = n-2; i >= 0; i--) {
18            for (int j = 0; j < m; j++) {
19                int down = dp[i+1][j];
20                int downLeft = j-1 >= 0 ? dp[i+1][j-1] : (int)1e9;
21                int downRight = j+1 < m ? dp[i+1][j+1] : (int)1e9;
22                
23                dp[i][j] = matrix[i][j] + Math.min(down, Math.min(downLeft, downRight));
24            }
25        }
26
27        for (int j = 0; j < m; j++) {
28            res = Math.min(res, dp[0][j]);
29        }
30
31        return res;
32    }
33
34}