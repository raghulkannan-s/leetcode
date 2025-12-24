// Last updated: 12/25/2025, 4:24:15 AM
1class Solution {
2
3    int retMax( int a, int b ){
4        return a>b?a:b;
5    }
6
7    public int maxProduct(int[] nums) {
8        int n = nums.length;
9        int max = Integer.MIN_VALUE;
10
11        int prefix = 1;
12        int suffix = 1;
13        
14        for ( int i = 0; i<n; i++ ){
15
16            prefix = prefix == 0 ? 1 : prefix;
17            suffix = suffix == 0 ? 1 : suffix;
18
19            prefix*=nums[i];
20            suffix*=nums[n-1-i];
21
22            max = retMax( max, retMax( prefix, suffix ) );
23
24        }
25        
26        return max;
27    }
28}