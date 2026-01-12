// Last updated: 1/13/2026, 1:58:16 AM
1class Solution {
2
3    int findMax( int a, int b ){
4        if( a>b ) return a;
5        return b;
6    }
7
8    public int findMaxConsecutiveOnes(int[] nums) {
9        
10        int max = 0;
11        int left = 0;
12
13        for ( int right = 0; right<nums.length; right++ ){
14
15            if( nums[right] == 0){
16                left = right+1;
17                continue;
18            }
19
20            int currMax = right - left +1;
21            max = findMax( currMax, max );
22
23        }
24
25        return max;
26
27    }
28}