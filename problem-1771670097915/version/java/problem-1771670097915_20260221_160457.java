// Last updated: 2/21/2026, 4:04:57 PM
1class Solution {
2    public int rob(int[] nums) {
3        
4        int[] dp = new int[nums.length];
5        Arrays.fill(dp, -1);
6
7        return search(dp, nums, 0);
8
9    }
10
11
12    public int search( int[] dp, int[] nums, int n ){
13        
14        if( n>=nums.length ) return 0;
15        
16        if (dp[n] != -1) return dp[n];
17
18        int rob = nums[n] + search( dp, nums, n+2 );
19        int skip = search( dp, nums, n+1 );
20
21
22        dp[n] = Math.max( rob, skip );
23
24        return dp[n];
25
26    } 
27}