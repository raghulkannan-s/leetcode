// Last updated: 12/17/2025, 12:34:48 AM
1class Solution {
2    public void setZeroes(int[][] mat) {
3        int m = mat.length;
4        int n = mat[0].length;
5
6        boolean[] rowFlag = new boolean[m];
7        boolean[] colFlag = new boolean[n];
8
9        for ( int row = 0; row<m; row++ ){
10            for ( int col = 0; col<n; col++ ){
11                if( mat[row][col] == 0 ){
12                    rowFlag[row] = true;
13                    colFlag[col] = true;
14                }
15            }
16        }
17
18        for ( int row = 0; row<m; row++ ){
19            for ( int col = 0; col<n; col++ ){
20                if ( rowFlag[row] || colFlag[col] ){
21                    mat[row][col] = 0;
22                }
23            }
24        }
25
26    }
27}