// Last updated: 12/19/2025, 12:23:44 AM
1class Solution {
2
3    public void moveZeroes(int[] nums) {
4        
5        int stay = 0;
6
7        for ( int scan = 0; scan < nums.length; scan++ ){
8            if( nums[scan] != 0 ){
9                int temp = nums[scan];
10                nums[scan] = nums[stay];
11                nums[stay] = temp;
12                stay++;
13            }
14        }
15
16
17        
18
19    }
20}