// Last updated: 3/21/2026, 12:39:47 PM
1class Solution {
2    public boolean canJump(int[] nums) {
3        int n = nums.length;
4        int maxReach = 0;
5
6        for ( int i = 0; i < n; i++ ){
7            int curr = i + nums[i];
8            if( maxReach < i ){
9                return false;
10            }
11            maxReach = Math.max( curr, maxReach );
12        }
13        if( maxReach >= n-1 ){
14            return true;
15        }
16        return false;
17    }
18}