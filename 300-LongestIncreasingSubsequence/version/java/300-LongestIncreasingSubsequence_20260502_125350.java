// Last updated: 5/2/2026, 12:53:50 PM
1class Solution {
2    public int lengthOfLIS(int[] nums) {
3        int n = nums.length;
4        int[] dp = new int[n];
5
6        Arrays.fill( dp, 1 );
7
8        for( int i = 0; i < n; i++ ){
9            for( int j = 0; j < i; j++ ){    
10                if( nums[i] > nums[j] ){
11                    dp[i] = Math.max( dp[j]+1, dp[i] );
12                }
13            }
14        }
15
16        int ans = 0;
17        for( int tailAnswers : dp ) ans = Math.max( ans, tailAnswers );
18
19
20        return ans;
21
22
23    }
24}