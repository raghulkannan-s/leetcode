// Last updated: 2/8/2026, 2:48:19 PM
1class Solution {
2    public int singleNumber(int[] nums) {
3        int xor = 0;
4
5
6        for( int i : nums ){
7            xor = xor^i;
8        }
9
10
11        return xor;
12    }
13}