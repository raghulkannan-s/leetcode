// Last updated: 4/24/2026, 9:15:35 PM
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
30        int n = board.length;
31        int m = board[0].length;
32
33        int[] dx = { 0, 1, 0, -1 };
34        int[] dy = { 1, 0, -1, 0 };
35
36        if( i >= 0 && j >= 0 && i < n && j < m && board[i][j] == 'O' ){
37            board[i][j] = 't';
38        }else{
39            return;
40        }
41
42        for( int d = 0; d < 4; d++ ){
43            int r = i + dx[d];
44            int c = j + dy[d];
45
46            dfs(r, c, board);
47        }
48
49    }
50
51}