// Last updated: 2/23/2026, 12:44:47 PM
1class Solution {
2    public int hammingWeight(int n) {
3        
4        int count = 0;
5
6
7        while ( n > 0 ){
8            int val = n&1;
9            if( val == 1 ) count++;
10             n>>=1;
11
12        }
13        
14        return count;
15    }
16}