// Last updated: 2/8/2026, 1:43:32 AM
1class Solution {
2    public int[] shuffle(int[] nums, int n) {
3        int[] res =  new int[nums.length];
4
5        int idx = 0;
6        int j = n;
7        for( int i = 0; i<n; i++ ){
8            res[idx++] = nums[i];
9            res[idx++] = nums[j++];
10            
11        }
12
13        return res;
14    }
15}