// Last updated: 5/6/2026, 10:06:13 AM
1class Solution {
2    public void setZeroes(int[][] matrix) {
3        int n = matrix.length;
4        int m = matrix[0].length;
5        boolean[] visitedRow = new boolean[n];
6        boolean[] visitedCol = new boolean[m];
7
8        for ( int i = 0; i < n; i++ ){
9            for ( int j = 0; j < m; j++ ){
10                if( matrix[i][j] == 0 ){
11                    visitedRow[i] = true;
12                    visitedCol[j] = true;
13                }
14            }
15        }
16
17        for ( int i = 0; i < n; i++ ){
18            for ( int j = 0; j < m; j++ ){
19                if( visitedRow[i] || visitedCol[j] ){
20                    matrix[i][j] = 0;
21                }
22            }
23        }
24
25    }
26}