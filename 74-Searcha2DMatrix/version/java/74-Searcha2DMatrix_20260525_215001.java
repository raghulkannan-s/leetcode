// Last updated: 5/25/2026, 9:50:01 PM
1class Solution {
2    public boolean searchMatrix(int[][] matrix, int target) {
3        
4        int n = matrix.length;
5        int m = matrix[0].length;
6
7        int left = 0;
8        int right = n*m-1;
9
10        while( left <= right ){
11
12            int mid = left + (right-left)/2; 
13
14            int row = mid/m;
15            int col = mid%m;
16
17            int val = matrix[row][col];
18
19            if( val == target ) return true;
20            else if( target > val ) left = mid+1;
21            else right = mid-1;
22
23        }
24
25        return false;
26    }
27}