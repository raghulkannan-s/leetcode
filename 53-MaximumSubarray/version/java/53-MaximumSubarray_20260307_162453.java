// Last updated: 3/7/2026, 4:24:53 PM
1class Solution {
2    public int maxSubArray(int[] nums) {
3
4
5        int max = Integer.MIN_VALUE;
6        int curr = 0;
7
8        for(int n : nums ){
9            curr += n;
10            max = Math.max( curr, max );
11            if( curr < 0 ) curr = 0;
12        }
13
14        return max;
15
16    }
17}