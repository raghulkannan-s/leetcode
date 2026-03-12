// Last updated: 3/12/2026, 9:49:26 AM
1class Solution {
2    public int dominantIndex(int[] nums) {
3        
4        int max = Integer.MIN_VALUE;
5        int mi = -1;
6
7        for( int i = 0; i < nums.length; i++ ){
8            if( nums[i] > max ) {
9                max = nums[i];
10                mi = i;
11            }
12        }
13
14        for( int i = 0; i < nums.length; i++ ){
15            if( nums[i] == max ) continue;
16            if( max < nums[i]*2 ) return -1;
17        }
18
19
20        return mi;
21
22    }
23}