// Last updated: 3/30/2026, 10:28:50 PM
1class Solution {
2    public int maxProfit(int[] prices) {
3        
4        int max = 0;
5        int min = prices[0];
6
7
8        for( int i : prices ){
9            int diff = i - min;
10            min = Math.min( min, i );
11            max = Math.max(diff, max);
12        }
13
14        return max;
15
16    }
17}