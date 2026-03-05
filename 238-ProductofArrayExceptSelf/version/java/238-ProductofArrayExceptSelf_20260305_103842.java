// Last updated: 3/5/2026, 10:38:42 AM
1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3        
4        int n = nums.length;
5
6        int[] prefix = new int[n];
7        int[] suffix = new int[n];
8
9        prefix[0] = nums[0];
10        suffix[n-1] = nums[n-1];
11
12        for( int i = 1; i<n; i++ ){
13            prefix[i] = prefix[i-1]*nums[i];
14        }
15        for( int i = n-2; i>=0; i-- ){
16            suffix[i] = suffix[i+1]*nums[i];
17        }
18        nums[0] = suffix[1];
19        nums[n-1] = prefix[n-2];
20        
21        for( int i = 1; i<n-1; i++ ){
22            nums[i] = prefix[i-1]*suffix[i+1];
23        }
24
25        return nums;
26
27    }
28}