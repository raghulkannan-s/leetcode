// Last updated: 3/25/2026, 9:18:41 AM
1class Solution {
2    public boolean canPartition(int[] nums) {
3        
4        int sum = 0;
5        int n = nums.length;
6        for( int i = 0; i < n; i++) sum += nums[i];
7        if( sum %2 != 0 ) return false;
8        
9        int target = sum/2;
10
11        return subs( nums, target );
12
13
14    }
15
16    private boolean subs(int[] nums, int target) {
17    int n = nums.length;
18    boolean[] prev = new boolean[target + 1];
19    
20    prev[0] = true;
21    
22
23    for (int i = 1; i < n; i++) {
24        boolean[] curr = new boolean[target + 1];
25        curr[0] = true;
26
27        for (int t = 1; t <= target; t++) {
28            boolean notTake = prev[t];
29            boolean take = false;
30            if (nums[i] <= t) take = prev[t - nums[i]];
31
32            curr[t] = take || notTake;
33        }
34        prev = curr;
35    }
36
37    return prev[target];
38}
39}