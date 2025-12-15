// Last updated: 12/15/2025, 6:58:12 PM
1class Solution {
2
3    void swap( int m, int n , int[][] matrix){
4        int temp = matrix[m][n];
5        matrix[m][n] = matrix[n][m];
6        matrix[n][m] = temp;
7    }
8
9    void swapCol( int l, int r, int row[] ){
10        int temp = row[l];
11        row[l] = row[r];
12        row[r] = temp;
13    }
14
15    public void rotate(int[][] matrix) {
16
17        int row = matrix.length;
18        int col = matrix[0].length;
19
20        for( int r = 0; r<row; r++ ){
21            for( int c = r; c<col; c++ ){
22                swap( r, c, matrix);
23            }
24        }    
25
26        for ( int r = 0; r < row; r++ ){
27            
28            int left = 0;
29            int right = col-1;
30
31            while(left < right){
32            
33                swapCol(left, right, matrix[r]);
34
35                left++;
36                right--;
37
38            }
39
40        }
41
42    }
43}