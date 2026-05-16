// Last updated: 5/16/2026, 11:57:10 PM
1class Solution {
2    public int singleNumber(int[] nums) {
3        int xor = 0;
4        for( int i : nums ){
5            xor = xor^i;
6        }
7        return xor;
8    }
9}