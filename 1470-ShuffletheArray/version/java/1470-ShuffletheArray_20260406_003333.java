// Last updated: 4/6/2026, 12:33:33 AM
1class Solution {
2    public int[] shuffle(int[] nums, int n) {
3        int[] res =  new int[nums.length];
4        int ptr = 0;
5        int j = n;
6        for( int i = 0; i < n; i++ ){
7            res[ptr++] = nums[i];
8            res[ptr++] = nums[i+n];   
9        }
10
11        return res;
12    }
13}