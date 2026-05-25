// Last updated: 5/25/2026, 10:04:58 PM
1class Solution {
2    public boolean searchMatrix(int[][] matrix, int target) {
3        
4        int n = matrix.length;
5        int m = matrix[0].length;
6
7        int row = 0;
8        int col = m-1;
9
10        while( row < n && col >= 0 ){
11
12            int val = matrix[row][col];
13
14            if( target == val ) return true;
15            else if( target > val ) row++;
16            else col--;
17
18        }
19
20        return false;
21    }
22}