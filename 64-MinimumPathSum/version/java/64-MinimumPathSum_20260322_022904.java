// Last updated: 3/22/2026, 2:29:04 AM
1class Solution {
2    public int minPathSum(int[][] grid) {
3
4        int m = grid[0].length;
5        int n = grid.length;
6
7        int[][] dp = new int[n][m];
8        for( int[] arr : dp ) Arrays.fill(arr, -1);
9
10        return helper( 0, 0, grid, dp );
11
12    }
13
14    private static int helper( int i, int j, int[][] grid, int[][]dp ){
15        
16        if( i >= grid.length || j >=grid[0].length ) return -1;
17        if( i == grid.length-1 && j == grid[0].length-1 ) return grid[i][j];
18        if(dp[i][j] != -1) return dp[i][j];
19
20        int right = helper( i, j+1, grid, dp );
21        int down = helper( i+1, j, grid, dp );
22        
23        if( right != -1 && down != -1 ) dp[i][j] = grid[i][j] + Math.min( right, down );
24        else if (right == -1) dp[i][j] =  grid[i][j] + down;
25        else dp[i][j] =  grid[i][j] + right;
26
27        return dp[i][j];
28    }
29
30}