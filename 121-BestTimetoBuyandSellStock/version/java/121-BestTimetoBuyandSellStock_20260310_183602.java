// Last updated: 3/10/2026, 6:36:02 PM
1class Solution {
2    public int maxProfit(int[] prices) {
3        
4        int max = 0;
5        int min = prices[0];
6
7
8        for( int i : prices ){
9
10            int diff = i - min;
11            min = Math.min( min, i );
12            max = Math.max(diff, max);
13
14        }
15
16        return max;
17
18    }
19}