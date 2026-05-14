// Last updated: 5/14/2026, 11:45:09 PM
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
13        for( int i = idx; i<nums.length; i++ ){
14            curr.add( nums[i] );
15            backtrack( i+1, nums, curr, res );
16            curr.remove(curr.size()-1);
17        }
18
19
20    }
21}