// Last updated: 5/3/2026, 9:07:55 AM
1class Solution {
2    public int[] countOppositeParity(int[] nums) {
3        int n = nums.length;
4        int[] ans = new int[n];
5
6        for( int i = 0; i < n; i++ ){
7            int count = 0;
8            for( int j = i+1; j < n; j++ ){
9                if( (nums[i]%2) != ( nums[j]%2)) count++;
10            }
11            ans[i]= count;
12        }
13
14        return ans;
15    }
16}