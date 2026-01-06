// Last updated: 1/6/2026, 11:25:04 AM
1class Solution {
2
3
4    int max( int a, int b ){
5        if( a > b ){
6            return a;
7        }
8        return b;
9    }
10
11    int min( int a, int b ){
12        if( a < b ){
13            return a;
14        }
15        return b;
16    }
17
18    public int maxProfit(int[] prices) {
19       
20        int min = prices[0];
21        int max = 0;
22
23        for ( int price : prices ){
24
25            int curr = price - min;
26            min = min( price, min );
27            max = max( curr, max );
28        }
29
30        return max;
31
32
33    }
34}