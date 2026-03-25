// Last updated: 3/25/2026, 9:52:30 AM
1class Solution {
2    public boolean canPartition(int[] nums) {
3        int sum = 0;
4        for (int x : nums) sum += x;
5
6        if (sum % 2 != 0) return false;
7        int target = sum / 2;
8
9        int n = nums.length;
10        boolean[][] dp = new boolean[n][target + 1];
11
12        for (int i = 0; i < n; i++) dp[i][0] = true;
13
14        if (nums[0] <= target) dp[0][nums[0]] = true;
15
16        for (int i = 1; i < n; i++) {
17            for (int t = 1; t <= target; t++) {
18
19                boolean notTake = dp[i-1][t];
20
21                boolean take = false;
22                if (nums[i] <= t) {
23                    take = dp[i-1][t - nums[i]];
24                }
25
26                dp[i][t] = take || notTake;
27            }
28        }
29        return dp[n-1][target];
30    }
31}