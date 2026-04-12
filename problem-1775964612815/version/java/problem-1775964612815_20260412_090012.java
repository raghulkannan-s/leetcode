// Last updated: 4/12/2026, 9:00:12 AM
1class Solution {
2    public int[] findDegrees(int[][] matrix) {
3        int n = matrix.length;
4        int[] ans = new int[n];
5
6
7        for( int i  = 0; i<n; i++ ){
8            int d = 0;
9
10            for( int j = 0; j< n; j++ ){
11
12                d += matrix[i][j];
13                
14            }
15
16            ans[i] = d;
17            
18        }
19
20        return ans;
21    }
22}