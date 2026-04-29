// Last updated: 4/29/2026, 3:30:28 PM
1class Solution {
2    public int maxProfit(int[] prices) {
3        
4        int max = 0;
5        int min = Integer.MAX_VALUE;       
6
7        for( int p : prices ){
8
9            min = Math.min( min, p );
10            max = Math.max( max, p - min );
11
12        }
13        
14        return max;
15
16    }
17}