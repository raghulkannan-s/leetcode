// Last updated: 1/12/2026, 2:39:18 AM
1class Solution {
2
3    public boolean containsDuplicate(int[] nums) {
4
5        Map<Integer, Integer> seen = new HashMap<>();
6
7        for ( int i = 0; i<nums.length; i++ ){
8            if( seen.containsKey(nums[i]) ) return true;
9            seen.put(nums[i], 1);
10        }
11
12        return false;
13    }
14}