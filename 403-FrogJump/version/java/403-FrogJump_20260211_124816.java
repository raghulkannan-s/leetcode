// Last updated: 2/11/2026, 12:48:16 PM
1class Solution {
2    public int fib(int n) {
3      
4      int[] dp = new int[n+1];
5        
6      return solve( n, dp );
7      
8    }
9
10
11    public int solve( int n, int[] dp ){
12
13        if( n < 2 ) return n;
14
15        if( dp[n] != 0 ) return dp[n]; 
16
17        dp[n] = solve(n-1, dp) + solve(n-2 , dp);
18        
19        return dp[n];
20    }
21}