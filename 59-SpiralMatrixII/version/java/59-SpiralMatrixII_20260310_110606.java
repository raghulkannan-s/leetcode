// Last updated: 3/10/2026, 11:06:06 AM
1class Solution {
2    public int[][] generateMatrix(int n) {
3        
4        int e = n*n;
5        int[][] res = new int[n][n];
6
7        int dir = 0; 
8
9        int row = 0;
10        int col = 0;
11
12        int[] rowState = { 0, 1, 0, -1 };
13        int[] colState = { 1, 0, -1, 0 };
14
15        for( int i = 0; i<e; i++ ){
16
17            
18            res[row][col] = i+1;
19
20            int nextRow = row + rowState[dir];
21            int nextCol = col + colState[dir];
22            
23            if( nextRow < 0 || nextRow >=n ||nextCol < 0 || nextCol >= n  || res[nextRow][nextCol] > 0 ){
24                
25                dir = (dir+1)%4;
26
27            }
28                row += rowState[dir];
29                col += colState[dir];
30
31        }
32
33        return res;
34
35    }
36}