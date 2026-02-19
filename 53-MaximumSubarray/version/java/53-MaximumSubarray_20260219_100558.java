// Last updated: 2/19/2026, 10:05:58 AM
1class Solution {
2    public int maxSubArray(int[] nums) {
3
4
5        int max = Integer.MIN_VALUE;
6        int curr = 0;
7
8        for(int i = 0; i<nums.length; i++ ){
9            
10            int num = nums[i];
11
12            curr += num;
13            
14            max = Math.max( curr, max );
15
16
17            if( curr < 0 ){
18                curr = 0;
19            }
20
21            
22
23        }
24
25        return max;
26
27    }
28}