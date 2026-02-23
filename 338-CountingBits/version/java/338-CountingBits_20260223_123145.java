// Last updated: 2/23/2026, 12:31:45 PM
1class Solution {
2    public int[] countBits(int n) {
3        
4        int[] res = new int[n+1];
5        for( int i = 1; i<=n; i++ )
6            res[i] = res[i>>1] + (i&1);
7        return res;
8
9    }
10}