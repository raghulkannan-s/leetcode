// Last updated: 12/16/2025, 1:13:07 AM
1class Solution {
2    public boolean searchMatrix(int[][] matrix, int target) {
3
4        int m = matrix.length;
5        int n = matrix[0].length;
6
7        int low = 0;       
8        int high = m*n-1;       
9
10        while( low <= high ){
11            
12            int mid = low+(high-low)/2;
13
14            int row = mid/n;
15            int col = mid%n;
16
17            int val = matrix[row][col];
18
19            if( val == target ){
20                return true;
21            }else if( val < target ){
22                low = mid+1;
23            }else{
24                high = mid-1;
25            }
26        }
27
28        return false;
29    }
30}