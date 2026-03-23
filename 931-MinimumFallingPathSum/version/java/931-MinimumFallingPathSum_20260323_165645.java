// Last updated: 3/23/2026, 4:56:45 PM
1class Solution {
2    public int minFallingPathSum(int[][] matrix) {
3        
4        int n = matrix.length;
5        int m = matrix[0].length;
6
7        int inf = (int) 1e9;
8
9        int[] prev = new int[m];
10        for( int i = 0; i<m; i++ ) prev[i] = matrix[0][i];
11
12        for( int i = 1; i < n; i++  ){
13            int[] curr = new int[m];
14            for( int j = 0; j < m; j++ ){
15                
16                int left = ( j > 0 )? prev[j-1] : inf;
17                int right = ( j < m-1 )? prev[j+1] : inf;
18                int center = prev[j];
19
20                curr[j] = matrix[i][j] + Math.min( center, Math.min(left, right) );
21            }
22            prev = curr;
23        }
24
25        int res = inf;
26        for( int i = 0; i<m; i++ ){
27            res = Math.min( res, prev[i] );
28        }
29
30        return res;
31    }
32
33}