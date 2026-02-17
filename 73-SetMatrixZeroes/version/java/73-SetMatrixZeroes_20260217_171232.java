// Last updated: 2/17/2026, 5:12:32 PM
1class Solution {
2    public void setZeroes(int[][] mat) {
3        int m = mat.length;
4        int n = mat[0].length;
5
6        boolean rowZero = false; 
7        boolean colZero = false; 
8
9        for ( int i = 0; i<n; i++ ){
10            if( mat[0][i] == 0 ){
11                rowZero = true;
12                break;
13            }
14        }
15        for ( int i = 0; i<m; i++ ){
16            if( mat[i][0] == 0 ){
17                colZero = true;
18                break;
19            }
20        }
21
22        for ( int row = 1; row<m; row++ ){
23            for ( int col = 1; col<n; col++ ){
24                if( mat[row][col] == 0 ){
25                    mat[row][0] = 0;
26                    mat[0][col] = 0;
27                }
28            }
29        }
30
31        for ( int row = 1; row<m; row++ ){
32            for ( int col = 1; col<n; col++ ){
33                if ( mat[0][col] == 0 || mat[row][0] == 0 ){
34                    mat[row][col] = 0;
35                }
36            }
37        }
38
39        if(rowZero){
40            for ( int i = 0; i<n; i++ ) mat[0][i] = 0;
41        }    
42        if(colZero){
43            for ( int i = 0; i<m; i++ ) mat[i][0] = 0;
44        }    
45
46    }
47}