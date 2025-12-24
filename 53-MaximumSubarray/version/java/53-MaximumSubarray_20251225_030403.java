// Last updated: 12/25/2025, 3:04:03 AM
1class Solution {
2    public int maxSubArray(int[] nums) {
3
4        int curr = 0;
5        int max = nums[0];
6
7        for ( int i = 0; i<nums.length; i++ ){
8
9            curr+=nums[i];
10
11            if( curr > max ) max = curr;
12            if ( curr < 0 ) curr = 0;
13
14        }
15
16        return max;
17
18    }
19}