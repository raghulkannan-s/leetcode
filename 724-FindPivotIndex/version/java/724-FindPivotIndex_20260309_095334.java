// Last updated: 3/9/2026, 9:53:34 AM
1class Solution {
2    public int pivotIndex(int[] nums) {
3        
4        int total = 0;
5        int left = 0;
6
7        for( int i : nums ){
8            total += i;
9        }
10
11        for( int i = 0; i<nums.length; i++ ){
12
13            int right = total - left - nums[i];
14            if( left == right ) return i;
15            left += nums[i];
16
17        }
18        return -1;                
19    }
20}