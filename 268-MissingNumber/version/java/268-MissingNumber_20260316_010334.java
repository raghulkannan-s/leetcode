// Last updated: 3/16/2026, 1:03:34 AM
1class Solution {
2    public int missingNumber(int[] nums) {
3        
4        int n = nums.length;
5        boolean[] seen = new boolean[n+1];
6
7        for( int i : nums ) seen[i] = true;
8        for( int i = 1; i <= n; i++ )if( seen[i] == false ) return i;
9
10        return 0;
11
12
13    }
14}