// Last updated: 2/21/2026, 12:22:29 PM
1class Solution {
2
3    public int maxProfit(int[] prices) {
4       
5       int max = 0;
6       int min = prices[0];
7
8
9       for( int p : prices ){
10
11        int diff = p - min;
12 
13        min = Math.min( p, min );
14        max = Math.max( max, diff );
15
16
17       }
18
19        return max;
20
21    }
22}