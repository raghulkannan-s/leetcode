// Last updated: 2/25/2026, 2:46:17 PM
1class Solution {
2    public int coinChange(int[] coins, int amount) {
3        
4        int[] dp = new int[amount+1];
5        return dfs( coins, amount, dp );
6
7    }
8
9    private int dfs( int[] coins, int amt, int[] dp ){
10
11        if( amt == 0 ) return 0;
12        if( amt < 0 ) return -1;
13        if( dp[amt] != 0 ) return dp[amt];
14
15        int min = Integer.MAX_VALUE;
16
17        for( int coin : coins ){
18            int res = dfs(coins, amt - coin, dp);
19            if (res >= 0 && res < min)
20                min = 1 + res;
21        }
22
23        dp[amt] = ( min == Integer.MAX_VALUE )? -1: min ;
24
25        return dp[amt];
26
27    }
28
29
30}