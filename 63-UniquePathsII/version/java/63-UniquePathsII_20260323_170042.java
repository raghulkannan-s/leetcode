// Last updated: 3/23/2026, 5:00:42 PM
1class Solution {
2    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
3        
4        int m = obstacleGrid.length;
5        int n = obstacleGrid[0].length;
6
7        int[][] dp = new int[m][n];
8
9        for (int i = 0; i < m; i++) {
10            Arrays.fill(dp[i], -1);
11        }
12
13        return helper(0, 0, obstacleGrid, dp);
14    }
15
16    public int helper(int i, int j, int[][] grid, int[][] dp) {
17
18        int m = grid.length;
19        int n = grid[0].length;
20
21        if (i >= m || j >= n) return 0;
22        if (grid[i][j] == 1) return 0;
23        if (i == m - 1 && j == n - 1) return 1;
24        if (dp[i][j] != -1) return dp[i][j];
25
26        int down = helper(i + 1, j, grid, dp);
27        int right = helper(i, j + 1, grid, dp);
28
29        dp[i][j] = down + right;
30
31        return dp[i][j];
32    }
33}