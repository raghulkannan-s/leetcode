// Last updated: 5/4/2026, 4:29:29 PM
1class Solution {
2    public List<List<String>> solveNQueens(int n) {
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
15        return res;
16    }
17
18    void backtrack( int row, char[][] board, List<List<String>> res, boolean[] colCheck, boolean[] diagLeftToRight, boolean[] diagRightToLeft ){
19        
20        if( row == board.length ){
21            List<String> ans = new ArrayList<>();
22            for( char[] rows : board ){
23                ans.add(new String(rows));
24            }
25            res.add(ans);
26            return;
27        }
28
29        for( int col = 0; col < board.length; col++ ){
30
31            if( !colCheck[col] && !diagLeftToRight[row-col+board.length-1] && !diagRightToLeft[row+col] ){
32                board[row][col] = 'Q';
33                colCheck[col] = true;
34                diagLeftToRight[row-col+board.length-1] = true;
35                diagRightToLeft[row+col] = true;
36
37                backtrack( row+1, board, res, colCheck, diagLeftToRight, diagRightToLeft );
38
39                board[row][col] = '.';
40                colCheck[col] = false;
41                diagLeftToRight[row-col+board.length-1] = false;
42                diagRightToLeft[row+col] = false;
43
44            }
45
46            
47
48        }
49
50    }
51}