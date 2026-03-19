// Last updated: 3/20/2026, 1:24:35 AM
1
2class Solution {
3    public List<List<Integer>> subsets(int[] nums) {
4        List<List<Integer>> res = new ArrayList<>();
5        backtrack(0, nums, new ArrayList<>(), res);
6        return res;
7    }
8
9    private void backtrack(int idx, int[] nums, List<Integer> curr, List<List<Integer>> res) {
10
11        res.add( new ArrayList<>(curr) );
12
13
14        for( int i = idx; i<nums.length; i++ ){
15            curr.add( nums[i] );
16            backtrack( i+1, nums, curr, res );
17            curr.remove(curr.size()-1);
18        }
19
20
21    }
22}