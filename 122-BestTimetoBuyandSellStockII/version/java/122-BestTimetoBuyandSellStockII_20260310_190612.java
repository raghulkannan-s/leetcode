// Last updated: 3/10/2026, 7:06:12 PM
1class Solution {
2    public int maxProfit(int[] prices) {
3        
4        int profit = 0;
5
6        for( int i = 1; i < prices.length; i++ ){
7
8            profit += Math.max(0, prices[i] - prices[i-1]);
9
10
11        }
12
13        return profit;
14
15    }
16}