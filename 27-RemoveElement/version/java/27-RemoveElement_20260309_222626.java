// Last updated: 3/9/2026, 10:26:26 PM
1class Solution {
2    public int removeElement(int[] nums, int val) {
3
4        int write = 0;
5
6        for( int scan = 0; scan < nums.length; scan++ ){
7            if( nums[scan] != val ){
8                nums[write++] = nums[scan];    
9            }
10        }
11
12        return write;
13
14    }
15}