// Last updated: 3/1/2026, 10:48:44 PM
1class Solution {
2    public int findTargetSumWays(int[] nums, int target) {
3        return solve(0, 0, nums, target, new HashMap<>());
4    }
5
6    private int solve(int i, int sum, int[] nums, int target, Map<String, Integer> memo) {
7        if (i == nums.length) {
8            return sum == target ? 1 : 0;
9        }
10
11        String key = i + "," + sum;
12        if (memo.containsKey(key)) return memo.get(key);
13
14        int add = solve(i + 1, sum + nums[i], nums, target, memo);
15        int subtract = solve(i + 1, sum - nums[i], nums, target, memo);
16
17        memo.put(key, add + subtract);
18        return add + subtract;
19    }
20}