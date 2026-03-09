// Last updated: 3/9/2026, 10:32:58 PM
1class Solution {
2    public int removeDuplicates(int[] nums) {
3
4        int write = 0;
5
6        for( int scan = 0; scan < nums.length; scan++ ){
7
8            if( nums[scan] != nums[write] ){
9                write++;
10                swap( scan, write, nums );
11            }
12        }
13        return write+1;
14    }
15
16    public void swap( int a, int b, int[] nums ){
17        int temp = nums[a];
18        nums[a] = nums[b];
19        nums[b] = temp;
20    }
21}