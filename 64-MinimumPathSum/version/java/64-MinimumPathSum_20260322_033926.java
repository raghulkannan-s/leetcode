// Last updated: 3/22/2026, 3:39:26 AM
1class Solution {
2    public int minPathSum(int[][] grid) {
3
4        int m = grid[0].length;
5        int n = grid.length;
6
7        int[] prev = new int[m];
8        prev[0] = grid[0][0];
9
10        for( int i = 1; i<m; i++ ) {
11            prev[i] = grid[0][i] + prev[i-1];
12        }
13
14        for( int i = 1; i < n; i++ ){
15            int[] curr = new int[m];
16            
17            for( int j = 0; j<m; j++ ){
18                if( j == 0 ) curr[j] = grid[i][j] + prev[j];
19                else curr[j] = grid[i][j] + Math.min( curr[j-1], prev[j] );
20            }
21            prev = curr;
22        }
23
24
25        return prev[m-1];
26
27    }
28
29}