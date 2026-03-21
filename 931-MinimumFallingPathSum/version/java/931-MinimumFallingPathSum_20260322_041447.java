// Last updated: 3/22/2026, 4:14:47 AM
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
11
12        int res = Integer.MAX_VALUE;
13
14        for( int i = 0; i < m; i++  ){
15            res = Math.min( res, helper( 0, i, matrix, dp ) );
16        }
17
18        return res;
19    }
20
21    public static int helper( int row, int col, int[][] matrix, int[][] dp ){
22        int n = matrix.length;
23        int m = matrix[0].length;
24
25        if( col < 0 || col >= m ) return (int) 1e9;
26        if( row == n-1 ) return matrix[row][col];
27
28        if( dp[row][col] != (int) 1e9 ) return dp[row][col];
29
30        int left = helper( row+1, col-1, matrix, dp );
31        int right = helper( row+1, col+1, matrix, dp );
32        int center = helper( row+1, col, matrix, dp );
33
34        return dp[row][col] = matrix[row][col] + Math.min( center, Math.min(left, right) );
35
36    }
37}