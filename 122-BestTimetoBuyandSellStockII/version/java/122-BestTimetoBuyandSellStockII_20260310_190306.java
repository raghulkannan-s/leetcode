// Last updated: 3/10/2026, 7:03:06 PM
1class Solution {
2    public int maxProfit(int[] prices) {
3        
4        int max = 0;
5
6        for( int i = 1; i < prices.length; i++ ){
7
8            if( prices[i] > prices[i-1] ){
9                max+=(prices[i]-prices[i-1]);
10            }
11
12        }
13
14        return max;
15
16    }
17}