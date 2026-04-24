// Last updated: 4/24/2026, 9:18:02 PM
1class Solution {
2    public void solve(char[][] board) {
3        
4        int n = board.length;
5        int m = board[0].length;
6
7        for( int i = 0; i < n; i++ ){
8            for( int j = 0; j < m; j++ ){
9                if( (i == 0 || i == n-1 || j == 0 || j == m-1) && board[i][j] == 'O' ){
10                    dfs( i, j, board );
11                }
12            }
13        }
14
15        for( int i = 0; i < n; i++ ){
16            for( int j = 0; j < m; j++ ){
17                if( board[i][j] == 'O' ){
18                    board[i][j] = 'X';
19                }
20                else if( board[i][j] == 't' ){
21                    board[i][j] = 'O';
22                }
23            }
24        }
25
26    }
27
28    public void dfs( int i, int j, char[][] board ){
29        
30        board[i][j] = 't';
31
32        int n = board.length;
33        int m = board[0].length;
34
35        int[] dx = { 0, 1, 0, -1 };
36        int[] dy = { 1, 0, -1, 0 };
37
38
39        for( int d = 0; d < 4; d++ ){
40            int r = i + dx[d];
41            int c = j + dy[d];
42
43            if( r >= 0 && c >= 0 && r < n && c < m && board[r][c] == 'O' ){
44                dfs(r, c, board);
45            }
46        }
47
48    }
49
50}