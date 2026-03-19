// Last updated: 3/19/2026, 6:57:25 PM
1import java.util.*;
2
3class Solution {
4    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
5        List<List<Integer>> res = new ArrayList<>();
6        List<Integer> curr = new ArrayList<>();
7        Arrays.sort(candidates);
8        helper(res, curr, target, candidates, 0);
9        return res;
10    }
11
12    private void helper(List<List<Integer>> res, List<Integer> curr, int target, int[] nums, int idx) {
13
14        if (target == 0) {
15            res.add(new ArrayList<>(curr));
16            return;
17        }
18
19        if (idx == nums.length) return;
20
21        if (nums[idx] <= target) {
22            curr.add(nums[idx]);
23            helper(res, curr, target - nums[idx], nums, idx + 1);
24            curr.remove(curr.size() - 1);
25        }
26
27        int next = idx + 1;
28        while (next < nums.length && nums[next] == nums[idx]) next++;
29
30        helper(res, curr, target, nums, next);
31    }
32}