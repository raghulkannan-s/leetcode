// Last updated: 6/1/2026, 11:09:50 PM
1class Solution {
2    public int change(int amount, int[] coins) {
3
4        int[] dp = new int[amount + 1];
5
6        dp[0] = 1;
7
8        for (int coin : coins) {
9
10            for (int i = coin; i <= amount; i++) {
11
12                dp[i] += dp[i - coin];
13            }
14        }
15
16        return dp[amount];
17    }
18}