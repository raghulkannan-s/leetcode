// Last updated: 4/24/2026, 5:44:28 PM
1class Solution {
2    public int numIslands(char[][] grid) {
3        
4        int n = grid.length;
5        int m = grid[0].length;
6        int ans = 0;
7
8        for( int i = 0; i<n; i++){
9            for( int j = 0; j < m; j++ ){
10                if( grid[i][j] == '1' ){
11                    dfs( i, j, grid );
12                    ans++;
13                }
14            }
15        }
16
17        return ans;
18
19    }
20    
21    public void dfs( int i, int j, char[][] grid ){
22
23        if(  i >= 0 && j >=0 && i<grid.length && j < grid[0].length && grid[i][j] == '1' ){
24            grid[i][j] = '0';
25                
26            int[] dr = { 0, 1, 0, -1 };
27            int[] dc = { 1, 0, -1, 0 };
28
29            for( int k = 0; k < 4; k++ ){
30                dfs( i + dr[k], j + dc[k], grid );
31            }
32
33        }
34
35        return;
36
37    }
38}