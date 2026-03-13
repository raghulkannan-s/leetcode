// Last updated: 3/13/2026, 11:08:10 AM
1class Solution {
2    public void gameOfLife(int[][] board) {
3        
4        int m = board.length;
5        int n = board[0].length;
6        int[][] result = new int[m][n];
7
8        for( int i = 0; i < m; i++ ){
9            for( int j = 0; j < n; j++ ){
10
11                int count = countNei(board, i, j);
12
13                if( board[i][j] == 1 ){
14                    if( count < 2 || count > 3 ) result[i][j] = 0;
15                    else result[i][j] = 1;
16                }
17
18                else if( board[i][j] == 0 ){
19                    if( count == 3 ) result[i][j] = 1;
20                }
21            }
22        }
23
24        for( int i = 0; i < m; i++ ){
25            for( int j = 0; j < n; j++ ){
26                board[i][j] = result[i][j];
27            }
28        }
29
30        
31
32    }
33    private int countNei(int[][] board, int i, int j){
34        
35        int[] dx = {-1,-1,-1,0,0,1,1,1};
36        int[] dy = {-1,0,1,-1,1,-1,0,1};
37
38        int m = board.length;
39        int n = board[0].length;
40
41        int d = dx.length;
42        int count = 0;
43
44        for( int k = 0; k<d; k++ ){
45            int newI = i+dx[k];
46            int newJ = j+dy[k];
47            if ( newI >= 0 && newI < m && newJ >=0 && newJ < n){
48                if (board[newI][newJ] == 1){
49                    count++;
50                }
51            }
52        }
53        return count;
54    }
55}