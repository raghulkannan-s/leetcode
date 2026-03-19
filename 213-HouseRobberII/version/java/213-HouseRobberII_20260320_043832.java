// Last updated: 3/20/2026, 4:38:32 AM
1class Solution {
2    public int rob(int[] nums) {
3        
4        int n = nums.length;
5
6        if( n == 1 ) return nums[0];
7
8        int[] dp1 = new int[n+2];
9        int[] dp2 = new int[n+2];
10
11        for( int i = n-2; i>=0; i-- ){
12            int take = dp2[i+2] + nums[i];
13            int skip = dp2[i+1];
14            dp2[i] = Math.max(take, skip);
15        }
16        for( int i = n-1; i>=1; i-- ){
17            int take = dp1[i+2] + nums[i];
18            int skip = dp1[i+1];
19            dp1[i] = Math.max(take, skip);
20        }
21
22        return Math.max(dp1[1], dp2[0]);
23    } 
24}