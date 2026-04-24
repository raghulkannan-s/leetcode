// Last updated: 4/24/2026, 9:28:32 PM
1class Solution {
2    public int numEnclaves(int[][] grid) {
3        
4        int n = grid.length;
5        int m = grid[0].length;
6
7        int count = 0;
8
9        for( int i = 0; i < n; i++ ){
10            for( int j = 0; j < m; j++ ){
11                if( (i == 0 || i == n-1 || j == 0 || j == m-1) && grid[i][j] == 1 ){
12                    dfs( i, j, grid );
13                }
14            }
15        }
16        
17        for( int i = 0; i < n; i++ ){
18            for( int j = 0; j < m; j++ ){
19                if( grid[i][j] == 1 ) {
20                    count++;
21                }
22            }
23        }
24
25        return count;
26
27    }
28
29    public void dfs( int i, int j, int[][] grid ){
30
31        int n = grid.length;
32        int m = grid[0].length;
33
34        grid[i][j] = 2;
35
36        int[] dx = { 0, 1, 0, -1 };
37        int[] dy = { 1, 0, -1, 0 };
38
39        for( int d = 0; d<4; d++ ){
40
41            int r = i + dx[d];
42            int c = j + dy[d];
43
44            if( r >= 0 && r < n && c >= 0 && c < m && grid[r][c] == 1 ){
45                dfs( r, c, grid );
46            }
47
48        }
49
50    }
51
52}