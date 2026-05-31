// Last updated: 5/31/2026, 12:12:19 PM
1class Solution {
2    public int climbStairs(int n) {
3
4        int[] dp = new int[n+1];
5
6        dp[0] = 1;
7        dp[1] = 1;
8
9        for( int i = 2; i<=n; i++ ){
10            dp[i] = dp[i-1] + dp[i-2];
11        }
12
13        return dp[n];
14
15    }
16}