// Last updated: 5/5/2026, 10:52:54 PM
1class Solution {
2    public int totalNQueens(int n) {
3        
4        List<List<String>> res = new ArrayList<>();
5
6        char[][] board = new char[n][n];
7
8        for( char[] currBoard : board ) Arrays.fill( currBoard, '.' );
9        
10        boolean[] colCheck = new boolean[n]; 
11        boolean[] diagLeftToRight = new boolean[2*n-1]; // r - c + n -1
12        boolean[] diagRightToLeft = new boolean[2*n-1]; // r + c
13
14        backtrack( 0, board, res, colCheck, diagLeftToRight, diagRightToLeft );
15        return res.size();
16    }
17
18    void backtrack( int row, char[][] board, List<List<String>> res, boolean[] colCheck, boolean[] diagLeftToRight, boolean[] diagRightToLeft ){
19        int n = board.length;
20        if( row == n ){
21            List<String> ans = new ArrayList<>();
22            for( char[] rows : board ){
23                ans.add(new String(rows));
24            }
25            res.add(ans);
26            return;
27        }
28
29        for( int col = 0; col < n; col++ ){
30            
31            int d1 = row-col+n-1;
32            int d2 = row + col;
33
34            if( !colCheck[col] && !diagLeftToRight[d1] && !diagRightToLeft[d2] ){     
35                board[row][col] = 'Q';
36                colCheck[col] = true;
37                diagLeftToRight[d1] = true;
38                diagRightToLeft[d2] = true;
39
40                backtrack( row+1, board, res, colCheck, diagLeftToRight, diagRightToLeft );
41
42                board[row][col] = '.';
43                colCheck[col] = false;
44                diagLeftToRight[d1] = false;
45                diagRightToLeft[d2] = false;
46
47            }
48
49        }
50
51    }
52}