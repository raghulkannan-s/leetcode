// Last updated: 5/25/2026, 10:31:20 PM
1class Solution {
2    public int[] findPeakGrid(int[][] mat) {
3        
4        int n = mat.length;
5        int m = mat[0].length;
6        
7        int left = 0;
8        int right = m-1;
9
10        while( left <= right ){
11
12            int midCol = left + (right-left)/2;
13
14            int maxRow = 0; 
15
16            for( int i = 0; i < n; i++ ){
17                if( mat[i][midCol] > mat[maxRow][midCol] ){
18                    maxRow = i;
19                } 
20            }
21
22            int leftVal = (midCol - 1 >= left) ? mat[maxRow][midCol - 1] : -1;
23            int rightVal = (midCol + 1 <= right) ? mat[maxRow][midCol + 1] : -1;
24            int currVal = mat[maxRow][midCol];
25
26            if( currVal > leftVal && currVal > rightVal ) return new int[]{maxRow, midCol};
27            else if( rightVal > currVal  ) left = midCol+1;
28            else right = midCol-1;
29
30        }
31        return new int[]{};
32    }
33}