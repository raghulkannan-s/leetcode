// Last updated: 5/17/2026, 11:14:34 PM
1class Solution {
2    public int numIslands(char[][] grid) {
3        int n = grid.length, m = grid[0].length, ans = 0;
4        for( int i = 0; i<n; i++){
5            for( int j = 0; j < m; j++ ){
6                if( grid[i][j] == '1' ){
7                    dfs( i, j, grid );
8                    ans++;
9                }
10            }
11        }
12        return ans;
13    }
14    public void dfs( int i, int j, char[][] grid ){
15        if(  i >= 0 && j >=0 && i<grid.length && j < grid[0].length && grid[i][j] == '1' ){
16            grid[i][j] = '0';
17
18            int[] dr = { 0, 1, 0, -1 };
19            int[] dc = { 1, 0, -1, 0 };
20
21            for( int k = 0; k < 4; k++ ){
22                dfs( i + dr[k], j + dc[k], grid );
23            }
24        }
25    }
26}