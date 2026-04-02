// Last updated: 4/2/2026, 9:59:23 AM
1class Solution {
2    public int hIndex(int[] c) {
3        
4        int max = 0;
5
6        for( int i = 0; i < c.length; i++ ){
7            max = Math.max(c[i], max);
8        }
9
10
11        int ans = 0;
12
13        for( int i = 0; i<=max; i++ ){
14
15            int count = 0;
16
17            for( int j = 0; j<c.length; j++ ){
18                if( c[j] >= i ) count++;
19            }
20
21            if( count >= i ){
22                ans = Math.max(ans, i);
23            }
24
25        }
26
27        return ans;
28
29    }
30}