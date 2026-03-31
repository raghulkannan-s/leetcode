// Last updated: 3/31/2026, 10:54:57 AM
1class Solution {
2    public int maxProfit(int[] prices) {
3
4        int n = prices.length;
5        int[][][] dp = new int[n][2][3];
6
7        for( int i = 1; i<=2; i++ ){
8            dp[0][1][i] = -prices[0];
9        }
10        
11
12        for( int i = 1; i<n; i++ ){
13            for( int t = 1; t<2+1; t++ ){
14                
15                dp[i][0][t] = Math.max(
16                    dp[i-1][0][t],
17                    dp[i-1][1][t] + prices[i]
18                );
19
20                dp[i][1][t] = Math.max(
21                    dp[i-1][1][t],
22                    dp[i-1][0][t-1] - prices[i]
23                );
24
25            }
26        }
27
28        return dp[n-1][0][2];
29
30    }
31}