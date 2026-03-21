// Last updated: 3/22/2026, 3:36:34 AM
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
16            for( int j = 0; j<m; j++ ){
17
18                if( i == 0 && j == 0 ) curr[0] = grid[0][0];
19                else if( j == 0 ) curr[j] = grid[i][j] + prev[j];
20                else{
21                    int up = prev[j];
22                    int left = curr[j-1];
23                    curr[j] = grid[i][j] + Math.min( left, up );
24                }
25            }
26            prev = curr;
27        }
28
29
30        return prev[m-1];
31
32    }
33
34}