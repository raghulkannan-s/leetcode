// Last updated: 5/7/2026, 5:30:16 PM
1class Solution {
2
3    public int islandPerimeter(int[][] grid) {
4
5        int rows = grid.length;
6        int cols = grid[0].length;
7
8        int perimeter = 0;
9
10        for (int r = 0; r < rows; r++) {
11
12            for (int c = 0; c < cols; c++) {
13
14                if (grid[r][c] == 1) {
15
16                    perimeter += 4;
17
18                    if (r > 0 && grid[r - 1][c] == 1)
19                        perimeter -= 2;
20
21                    if (c > 0 && grid[r][c - 1] == 1)
22                        perimeter -= 2;
23                }
24            }
25        }
26
27        return perimeter;
28    }
29}