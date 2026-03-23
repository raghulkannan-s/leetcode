// Last updated: 3/23/2026, 5:24:12 PM
1class Solution {
2    public int uniquePathsWithObstacles(int[][] grid) {
3        
4        int n = grid.length;
5        int m = grid[0].length;
6
7        int[] prev = new int[m+1];
8        if( grid[0][0] != 1 ) prev[1] = 1;
9
10        for( int i = 1; i <= n; i++ ){
11
12            int[] curr = new int[m+1]; 
13
14            for( int j = 1; j<=m; j++ ){
15                if( grid[i-1][j-1] == 1 ){
16                    curr[j] = 0;
17                }else{
18                    curr[j] = prev[j] + curr[j-1];
19                }
20            }
21            prev = curr;
22        }
23        
24        return prev[m];
25    }
26}