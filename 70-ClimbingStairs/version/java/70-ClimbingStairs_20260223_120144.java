// Last updated: 2/23/2026, 12:01:44 PM
1class Solution {
2    public int climbStairs(int n) {
3       int[] dp =  new int[n+1];
4       return solve( n, dp );
5    }
6
7    public int solve(int n, int[] dp){
8        if( n == 0 ) return 1;
9        if( n <= 2 ) return n;
10        if( dp[n] > 0 ) return dp[n];
11        return dp[n] = solve( n-1, dp ) + solve( n-2, dp);
12    }
13}