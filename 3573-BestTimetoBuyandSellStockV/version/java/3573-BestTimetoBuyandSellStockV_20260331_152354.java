// Last updated: 3/31/2026, 3:23:54 PM
1class Solution {
2    public long maximumProfit(int[] prices, int k) {
3        int n = prices.length;
4        long NEG_INF = Long.MIN_VALUE / 2;
5
6        // dp[j][state]: max profit with j transactions started, in given state
7        // state 0 = free, 1 = holding long, 2 = holding short
8        long[][] dp = new long[k + 1][3];
9        for (long[] row : dp) Arrays.fill(row, NEG_INF);
10        dp[0][0] = 0;
11
12        for (int i = 0; i < n; i++) {
13            long[][] ndp = new long[k + 1][3];
14            for (long[] row : ndp) Arrays.fill(row, NEG_INF);
15
16            for (int j = 0; j <= k; j++) {
17                // free → stay free
18                if (dp[j][0] != NEG_INF) {
19                    ndp[j][0] = Math.max(ndp[j][0], dp[j][0]);
20                    if (j < k) {
21                        // free → buy long
22                        ndp[j+1][1] = Math.max(ndp[j+1][1], dp[j][0] - prices[i]);
23                        // free → sell short
24                        ndp[j+1][2] = Math.max(ndp[j+1][2], dp[j][0] + prices[i]);
25                    }
26                }
27                // holding long → stay or sell
28                if (dp[j][1] != NEG_INF) {
29                    ndp[j][1] = Math.max(ndp[j][1], dp[j][1]);
30                    ndp[j][0] = Math.max(ndp[j][0], dp[j][1] + prices[i]);
31                }
32                // holding short → stay or buy back
33                if (dp[j][2] != NEG_INF) {
34                    ndp[j][2] = Math.max(ndp[j][2], dp[j][2]);
35                    ndp[j][0] = Math.max(ndp[j][0], dp[j][2] - prices[i]);
36                }
37            }
38            dp = ndp;
39        }
40
41        long ans = 0;
42        for (int j = 0; j <= k; j++)
43            if (dp[j][0] != NEG_INF) ans = Math.max(ans, dp[j][0]);
44        return ans;
45    }
46}