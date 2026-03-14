// Last updated: 3/14/2026, 7:07:22 PM
1class Solution {
2    public int removeDuplicates(int[] nums) {
3        
4        int write = 0;
5
6        for( int scan = 0; scan < nums.length; scan++ ){
7
8            if( nums[scan] != nums[write] ){
9                write++;
10                nums[write] = nums[scan];
11            }
12
13        }
14
15        return write+1;
16
17    }
18}