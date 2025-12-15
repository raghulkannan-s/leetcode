// Last updated: 12/15/2025, 3:08:41 PM
1class Solution {
2    
3    public int[][] transpose(int[][] matrix) {
4        
5        int row = matrix.length;
6        int col = matrix[0].length;
7
8        int[][] result = new int[col][row];
9
10        for( int r = 0; r<row; r++ ){
11            for( int c = 0; c<col; c++ ){
12                result[c][r] = matrix[r][c];
13            }
14        }    
15
16        return result;
17    }
18}