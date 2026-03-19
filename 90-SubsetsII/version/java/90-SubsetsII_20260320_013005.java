// Last updated: 3/20/2026, 1:30:05 AM
1
2class Solution {
3    public List<List<Integer>> subsetsWithDup(int[] nums) {
4        List<List<Integer>> res = new ArrayList<>();
5        Arrays.sort(nums);
6        backtrack(0, nums, new ArrayList<>(), res);
7        return res;
8    }
9
10    private void backtrack(int idx, int[] nums, List<Integer> curr, List<List<Integer>> res) {
11
12        res.add(new ArrayList<>(curr));
13
14        for (int i = idx; i < nums.length; i++) {
15            if( i > idx && nums[i] == nums[i-1] ) continue;
16            curr.add(nums[i]);
17            backtrack(i + 1, nums, curr, res);
18            curr.remove(curr.size() - 1); 
19        }
20    }
21}