// Last updated: 2/23/2026, 11:57:06 AM
1class Solution {
2    public int climbStairs(int n) {
3       int[] dp =  new int[n+1];
4       return solve( n, dp );
5    }
6
7    public int solve(int n, int[] dp){
8        if( n <= 2 ) return n;
9        if( dp[n] > 0 ) return dp[n];
10        return dp[n] = solve( n-1, dp ) + solve( n-2, dp);
11    }
12}