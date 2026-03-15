// Last updated: 3/16/2026, 12:49:58 AM
1class Solution {
2
3    public void swap( int[] nums, int a, int b){
4
5        int temp = nums[a];
6        nums[a] = nums[b];
7        nums[b] = temp;
8
9    }
10   
11    public void moveZeroes(int[] nums) {
12
13        int write = 0;
14
15        for(int fast = 0; fast<nums.length; fast++){     
16            if( nums[fast] != 0 ) {
17                swap( nums, fast, write );
18                write++;
19            }
20        }
21
22    }
23}