// Last updated: 2/25/2026, 9:57:09 AM
1class Solution {
2    public int rob(int[] nums) {
3        
4        int[] dp = new int[nums.length+1];
5        Arrays.fill(dp, -1);
6
7        return search( 0, nums, dp );
8   }
9
10
11   private int search(int n, int[] nums, int[] dp){
12
13        if( n >= nums.length ) return 0;
14
15        if( dp[n] >= 0 ) return dp[n];
16
17        int rob = nums[n] + search( n+2, nums, dp );
18        int skip = search( n+1, nums, dp );
19
20        dp[n] = Math.max( rob, skip );
21
22        return dp[n];
23   } 
24}