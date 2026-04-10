// Last updated: 4/10/2026, 8:54:29 PM
1class Solution {
2    public List<List<Integer>> combinationSum(int[] candidates, int target) {
3        List<List<Integer>> res = new ArrayList<>();
4        List<Integer> curr = new ArrayList<>();
5        helper( res, curr, target, candidates, 0 );
6        return res;
7    }
8
9
10    private void helper( List<List<Integer>> res, List<Integer> curr, int target, int[] nums, int idx ){
11
12        if( target == 0 ){
13            res.add( new ArrayList<>(curr));
14            return;
15        }
16
17        if( idx == nums.length ) return;
18
19        if( nums[idx] <= target ){
20
21            curr.add( nums[idx] );
22            helper( res, curr, target-nums[idx], nums, idx );
23            curr.remove( curr.size()-1 );
24
25        }
26
27        helper( res, curr, target, nums, idx+1 );
28
29
30    }
31
32
33
34}