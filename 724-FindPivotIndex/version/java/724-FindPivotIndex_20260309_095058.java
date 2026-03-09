// Last updated: 3/9/2026, 9:50:58 AM
1class Solution {
2    public int pivotIndex(int[] nums) {
3        
4        int total = Arrays.stream(nums).sum();
5        int left = 0;
6
7        for( int i = 0; i<nums.length; i++ ){
8
9            int right = total - left - nums[i];
10            if( left == right ) return i;
11            left += nums[i];
12
13        }
14        return -1;                
15    }
16}