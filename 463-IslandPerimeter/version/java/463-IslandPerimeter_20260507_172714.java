// Last updated: 5/7/2026, 5:27:14 PM
1class Solution {
2
3    public int islandPerimeter(int[][] grid) {
4        
5        int n = grid.length;
6        int m = grid[0].length;
7        int perimeter = 0;
8
9        for( int row = 0; row < n; row++ ){
10            for( int col = 0; col < m; col++ ){
11
12                if( grid[row][col] == 1 ){
13
14                    if( row == 0 ) perimeter++;
15                    if( row == n-1 ) perimeter++;
16
17                    if( col == 0 ) perimeter++;
18                    if( col == m-1 ) perimeter++;
19
20                    if( row > 0 && grid[row-1][col] == 0) perimeter++;
21                    if( row < n-1 && grid[row+1][col] == 0) perimeter++;
22
23                    if( col > 0 && grid[row][col-1] == 0 ) perimeter++;
24                    if( col < m-1 && grid[row][col+1] == 0 ) perimeter++;
25                    
26                }
27                
28            }
29        }
30
31        return perimeter;
32    }
33}