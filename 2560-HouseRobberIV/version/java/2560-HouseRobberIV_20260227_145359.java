// Last updated: 2/27/2026, 2:53:59 PM
1class Solution {
2    public int minCapability(int[] nums, int k) {
3        int low = 0;
4        int high = 0;
5
6        for (int n : nums) {
7            high = Math.max(high, n);
8        }
9
10        while (low < high) {
11            int mid = low + (high - low) / 2;
12
13            if (canRob(nums, k, mid)) {
14                high = mid;        
15            } else {
16                low = mid + 1;     
17            }
18        }
19
20        return low;
21    }
22
23    private boolean canRob(int[] nums, int k, int cap) {
24        int count = 0;
25        int i = 0;
26
27        while (i < nums.length) {
28            if (nums[i] <= cap) {
29                count++;
30                i += 2;  
31            } else {
32                i++;
33            }
34        }
35
36        return count >= k;
37    }
38}