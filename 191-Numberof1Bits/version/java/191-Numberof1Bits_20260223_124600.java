// Last updated: 2/23/2026, 12:46:00 PM
1class Solution {
2    public int hammingWeight(int n) {
3        
4        int count = 0;
5        while ( n > 0 ){
6            count+=n&1;
7            n>>=1;
8        }
9        
10        return count;
11    }
12}