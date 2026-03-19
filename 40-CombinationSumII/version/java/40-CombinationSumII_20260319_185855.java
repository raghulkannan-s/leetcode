// Last updated: 3/19/2026, 6:58:55 PM
1
2class Solution {
3    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
4        List<List<Integer>> res = new ArrayList<>();
5        List<Integer> curr = new ArrayList<>();
6        Arrays.sort(candidates);
7        helper(res, curr, target, candidates, 0);
8        return res;
9    }
10
11    private void helper(List<List<Integer>> res, List<Integer> curr, int target, int[] nums, int idx) {
12
13        if (target == 0) {
14            res.add(new ArrayList<>(curr));
15            return;
16        }
17
18        if (idx == nums.length) return;
19        if (nums[idx] > target) return;
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