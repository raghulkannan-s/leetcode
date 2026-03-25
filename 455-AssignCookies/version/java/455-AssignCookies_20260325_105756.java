// Last updated: 3/25/2026, 10:57:56 AM
1class Solution {
2    public int findContentChildren(int[] g, int[] s) {
3        Arrays.sort(g); Arrays.sort(s);
4        int count = 0, si = 0, gi = 0;
5
6        while( si < s.length && gi < g.length ){
7            if( g[gi] <= s[si] ){
8                si++;
9                gi++;
10                count++;
11            }else{
12                si++;
13            }
14        }
15
16        return count;
17    }
18}