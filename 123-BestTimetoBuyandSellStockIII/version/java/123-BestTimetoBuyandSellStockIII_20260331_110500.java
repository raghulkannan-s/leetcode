// Last updated: 3/31/2026, 11:05:00 AM
1class Solution {
2    public int maxProfit(int[] prices) {
3
4        int n = prices.length;
5        int[][][] dp = new int[n+1][2][3];
6        
7
8        for( int i = n-1; i >= 0; i-- ){
9            for( int t = 1; t<2+1; t++ ){
10                
11                dp[i][0][t] = Math.max(
12                    dp[i+1][0][t],
13                    dp[i+1][1][t] - prices[i]
14                );
15
16                dp[i][1][t] = Math.max(
17                    dp[i+1][1][t],
18                    dp[i+1][0][t-1] + prices[i]
19                );
20
21            }
22        }
23
24        return dp[0][0][2];
25
26    }
27}