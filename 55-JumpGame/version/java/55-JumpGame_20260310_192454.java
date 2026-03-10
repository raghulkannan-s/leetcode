// Last updated: 3/10/2026, 7:24:54 PM
1class Solution {
2    public boolean canJump(int[] nums) {
3        
4        int maxReach = 0;
5
6        for(int i = 0; i < nums.length; i++){
7            if(i > maxReach) return false;
8            maxReach = Math.max(maxReach, i + nums[i]);
9        }
10
11        return true;
12
13    }
14}