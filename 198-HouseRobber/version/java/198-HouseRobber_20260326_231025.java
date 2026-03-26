// Last updated: 3/26/2026, 11:10:25 PM
1class Solution {
2    public int rob(int[] nums) {
3        
4        int n = nums.length;
5        int[] dp = new int[n+2];
6
7        for( int i = n-1; i>=0; i-- ){
8            int take = dp[i+2] + nums[i];
9            int skip = dp[i+1];
10            dp[i] = Math.max(take, skip);
11        }
12
13        return dp[0];
14    } 
15}