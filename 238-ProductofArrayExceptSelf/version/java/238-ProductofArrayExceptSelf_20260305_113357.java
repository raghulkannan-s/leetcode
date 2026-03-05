// Last updated: 3/5/2026, 11:33:57 AM
1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3        
4        int n = nums.length;
5        int[] res = new int[n];
6        res[n-1] = 1;
7
8        for( int i = n-2; i>=0; i-- )
9            res[i] = res[i+1]*nums[i+1];
10        
11        int prefix = 1;
12
13        for( int i = 0; i<n; i++ ){
14            res[i] *= prefix;
15            prefix *= nums[i];
16        }
17
18        return res;
19
20    }
21}