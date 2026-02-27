// Last updated: 2/27/2026, 7:20:26 PM
1class Solution {
2    public boolean isPowerOfTwo(int n) {
3        return n > 0 && (n & (n - 1)) == 0;
4    }
5}