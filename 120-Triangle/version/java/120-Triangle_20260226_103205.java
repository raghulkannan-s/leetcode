// Last updated: 2/26/2026, 10:32:05 AM
1class Solution {
2    public int minimumTotal(List<List<Integer>> triangle) {
3        
4        int n = triangle.size();
5
6        int[][] dp = new int[n][n];
7        for (int[] row : dp) {
8            Arrays.fill(row, Integer.MAX_VALUE);
9        }
10
11        return sum(triangle, 0, 0, dp );
12
13    }
14
15
16    private int sum(List<List<Integer>> tri, int row, int col, int[][] dp ){
17
18        if( dp[row][col] != Integer.MAX_VALUE ) return dp[row][col];
19        if(row == tri.size() - 1) {
20            return dp[row][col] = tri.get(row).get(col);
21        }
22
23        int first = sum( tri, row+1, col, dp );
24        int second = sum( tri, row+1, col+1, dp );
25
26        return dp[row][col] = tri.get(row).get(col) + Math.min( first, second );
27
28
29    }
30}