// Last updated: 12/6/2025, 12:21:00 AM
1class Solution {
2    public boolean containsDuplicate(int[] nums) {
3        
4        HashSet<Integer> seen = new HashSet<>();
5
6
7        for ( int num : nums ){
8            if( !seen.add(num) ) return true;
9        }
10        
11        return false;
12    }
13}