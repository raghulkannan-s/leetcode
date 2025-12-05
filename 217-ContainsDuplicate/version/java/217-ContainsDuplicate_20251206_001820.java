// Last updated: 12/6/2025, 12:18:20 AM
// using sort and check which saves space, but we can use hashset for better time
1class Solution {
2    public boolean containsDuplicate(int[] nums) {
3    
4        Arrays.sort(nums);
5
6        for ( int i = 0; i<nums.length-1; i++ ){
7            if ( nums[i] == nums[i+1] ) return true;
8        }
9
10        return false;
11        
12    }
13}