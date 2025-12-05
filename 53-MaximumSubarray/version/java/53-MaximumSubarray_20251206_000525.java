// Last updated: 12/6/2025, 12:05:25 AM
1class Solution {
2    public int maxSubArray(int[] nums) {
3
4        int curr = 0;
5        int max = nums[0];
6
7        for (int i = 0; i < nums.length; i++){
8            curr += nums[i];
9            if ( curr > max ) max = curr;
10            if ( curr < 0 ) curr = 0;
11        }
12        return max;
13    }
14}