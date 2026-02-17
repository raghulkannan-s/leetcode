// Last updated: 2/17/2026, 6:36:49 PM
1class Solution {
2    public void setZeroes(int[][] mat) {
3        int m = mat.length;
4        int n = mat[0].length;
5
6        boolean colZero = false; 
7
8        int maxLen = Math.max(m, n);
9
10        for ( int i = 0; i<maxLen; i++ ){
11            if( i<n && mat[0][i] == 0 ){
12                mat[0][0] = 0;
13            }
14            if( i<m && mat[i][0] == 0 ){
15                colZero = true;
16            }
17        }
18
19        for ( int row = 1; row<m; row++ ){
20            for ( int col = 1; col<n; col++ ){
21                if( mat[row][col] == 0 ){
22                    mat[row][0] = 0;
23                    mat[0][col] = 0;
24                }
25            }
26        }
27
28        for ( int row = 1; row<m; row++ ){
29            for ( int col = 1; col<n; col++ ){
30                if ( mat[0][col] == 0 || mat[row][0] == 0 ){
31                    mat[row][col] = 0;
32                }
33            }
34        }
35
36        if(mat[0][0] == 0){
37            for ( int i = 0; i<n; i++ ) mat[0][i] = 0;
38        }    
39        if(colZero){
40            for ( int i = 0; i<m; i++ ) mat[i][0] = 0;
41        }    
42
43    }
44}