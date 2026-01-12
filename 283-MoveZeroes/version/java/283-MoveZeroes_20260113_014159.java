// Last updated: 1/13/2026, 1:41:59 AM
1class Solution {
2
3    void swap( int[] arr, int a, int b ){
4        int temp = arr[a];
5        arr[a] = arr[b];
6        arr[b] = temp;
7    }
8
9    public void moveZeroes(int[] nums) {
10        
11        int write = 0;
12
13        for ( int read = 0; read < nums.length; read++ ){
14
15            if( nums[read] != 0 ){
16                swap( nums, read, write );
17                write++;
18            }
19
20        }        
21
22    }
23}