// Last updated: 4/26/2026, 8:56:52 AM
1class Solution {
2    public List<Integer> findValidElements(int[] nums) {
3        int n = nums.length;
4        List<Integer> res = new ArrayList<>();
5        
6        int[] prefix = new int[n];
7        int[] suffix = new int[n];
8
9        prefix[0] = Integer.MIN_VALUE;
10        
11        for( int i = 1; i < n; i++ ){
12            prefix[i] = Math.max(prefix[i-1], nums[i-1]);
13        }
14        
15        suffix[n-1] = Integer.MIN_VALUE;
16
17        for( int i = n-2; i >= 0; i-- ){
18            suffix[i] = Math.max(suffix[i+1], nums[i+1]);
19        }
20
21        for( int i = 0; i < n; i++ ){
22            if( nums[i]>prefix[i] || nums[i] > suffix[i] ){
23                res.add(nums[i]);
24            }
25        }
26        
27        return res;
28        
29    }
30}