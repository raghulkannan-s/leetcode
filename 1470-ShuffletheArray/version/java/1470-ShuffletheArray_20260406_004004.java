// Last updated: 4/6/2026, 12:40:04 AM
1class Solution {
2    public int findMaxConsecutiveOnes(int[] nums) {
3        
4        int max = 0;
5        int left = 0;
6
7        for ( int right = 0; right<nums.length; right++ ){
8            
9            if( nums[right] == 0){
10                left = right+1;
11                continue;
12            }
13            int currMax = right - left +1;
14            max = Math.max( currMax, max );
15        }
16
17        return max;
18    }
19}