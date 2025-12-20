// Last updated: 12/21/2025, 12:40:16 AM
1class Solution {
2
3    public int removeDuplicates(int[] nums) {
4        int i = 1;
5
6        for ( int j = 2; j<nums.length; j++ ){
7
8            if ( nums[j] != nums[i-1] ){
9                i++;
10                nums[i] = nums[j];
11            }
12
13        }
14
15        return i+1;
16    }
17}