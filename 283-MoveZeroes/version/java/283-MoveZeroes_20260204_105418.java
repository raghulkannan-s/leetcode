// Last updated: 2/4/2026, 10:54:18 AM
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
16            if( nums[fast] == 0 ) {
17                continue;
18            }
19            
20            swap( nums, fast, write );
21            write++;
22            
23        }
24
25    }
26}