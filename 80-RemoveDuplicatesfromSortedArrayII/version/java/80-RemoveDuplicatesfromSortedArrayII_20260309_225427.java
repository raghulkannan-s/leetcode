// Last updated: 3/9/2026, 10:54:27 PM
1class Solution {
2
3    public int removeDuplicates(int[] nums) {
4        
5        int write = 2;
6
7        if( nums.length < 3 ) return nums.length;
8        
9        for ( int i = 2 ; i < nums.length; i++ ){
10
11            if( nums[i] != nums[write-2] ){
12                nums[write] = nums[i];
13                write++;
14            }
15
16        }
17
18        return write;
19
20    }
21}