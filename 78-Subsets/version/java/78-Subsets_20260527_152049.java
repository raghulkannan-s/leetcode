// Last updated: 5/27/2026, 3:20:49 PM
1class Solution {
2    public List<List<Integer>> subsets(int[] nums) {
3        
4        List<List<Integer>> res = new ArrayList<>();
5        helper( 0, nums, new ArrayList<>(), res );
6        return res;
7
8    }
9
10    public void helper( int idx, int[] nums, List<Integer> curr, List<List<Integer>> res ){
11
12        res.add(new ArrayList<>(curr));
13        for( int i = idx; i < nums.length; i++ ){
14            curr.add( nums[i] );
15            helper( i+1, nums, curr, res);
16            curr.remove(curr.size()-1);
17        }
18    }
19
20}