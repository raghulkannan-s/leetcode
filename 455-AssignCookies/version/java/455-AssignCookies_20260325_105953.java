// Last updated: 3/25/2026, 10:59:53 AM
1class Solution {
2    public int findContentChildren(int[] g, int[] s) {
3        Arrays.sort(g); Arrays.sort(s);
4        int si = 0, gi = 0;
5
6        while( si < s.length && gi < g.length ){
7            if( g[gi] <= s[si] ) gi++;
8            si++;
9        }
10
11        return gi;
12    }
13}