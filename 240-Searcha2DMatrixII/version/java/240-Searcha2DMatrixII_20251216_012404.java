// Last updated: 12/16/2025, 1:24:04 AM
1class Solution {
2    public boolean searchMatrix(int[][] matrix, int target) {
3
4        int m = matrix.length;
5        int n = matrix[0].length;
6
7        int row = 0;
8        int col = n-1;
9
10        while( row<m && col>=0 ){
11
12            int val = matrix[row][col];
13
14            if( val == target ){
15                return true;
16            }else if( val < target ){
17                row++;
18            }else{
19                col--;
20            }
21        }
22
23        return false;
24    }
25}