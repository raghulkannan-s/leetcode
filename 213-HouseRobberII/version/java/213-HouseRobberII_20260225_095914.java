// Last updated: 2/25/2026, 9:59:14 AM
1class Solution {
2
3    public int rob(int[] nums) {
4
5        int n = nums.length;
6
7        if (n == 1) return nums[0];
8
9        int[] dp1 = new int[n];
10        int[] dp2 = new int[n];
11
12        Arrays.fill(dp1, -1);
13        Arrays.fill(dp2, -1);
14
15        int case1 = search(nums, 0, n - 2, dp1);
16        int case2 = search(nums, 1, n - 1, dp2);
17
18        return Math.max(case1, case2);
19    }
20
21    private int search(int[] nums, int index, int end, int[] dp) {
22
23        if (index > end) return 0;
24
25        if (dp[index] != -1) return dp[index];
26
27        int rob = nums[index] + search(nums, index + 2, end, dp);
28        int skip = search(nums, index + 1, end, dp);
29
30        dp[index] = Math.max(rob, skip);
31
32        return dp[index];
33    }
34}