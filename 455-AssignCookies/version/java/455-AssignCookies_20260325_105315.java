// Last updated: 3/25/2026, 10:53:15 AM
1class Solution {
2    public int findContentChildren(int[] g, int[] s) {
3        Arrays.sort(g);
4        Arrays.sort(s);
5        if( g.length == 0 || s.length == 0 ) return 0;
6        int count = 0;
7        int si = 0;
8        for( int i = 0; i < g.length; i++ ){
9            while( si < s.length-1 && s[si] < g[i] ) si++;
10            if( si < s.length && g[i] <= s[si]   ) {
11                count++;
12                si++;
13            }
14        }
15
16        return count;
17    }
18}