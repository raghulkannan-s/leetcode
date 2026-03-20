// Last updated: 3/21/2026, 12:18:18 AM
1class Solution {
2    public boolean canPartition(int[] nums) {
3        int sum = 0;
4        for (int num : nums) sum += num;
5
6        if (sum % 2 != 0) return false;
7
8        int target = sum / 2;
9        int n = nums.length;
10
11        int[][] dp = new int[n][target + 1]; 
12        
13        for (int i = 0; i < n; i++) {
14            Arrays.fill(dp[i], -1);
15        }
16
17        return helper(0, target, nums, dp);
18    }
19
20    private boolean helper(int i, int target, int[] nums, int[][] dp) {
21
22        if (target == 0) return true;
23        if (i >= nums.length) return false;
24
25        if (dp[i][target] != -1)
26            return dp[i][target] == 1;
27
28        boolean notTake = helper(i + 1, target, nums, dp);
29
30        boolean take = false;
31        if (nums[i] <= target) {
32            take = helper(i + 1, target - nums[i], nums, dp);
33        }
34
35        dp[i][target] = (take || notTake) ? 1 : 0;
36
37        return dp[i][target] == 1;
38    }
39}