// Last updated: 1/12/2026, 3:01:53 AM
1class Solution {
2    public int[] intersection(int[] nums1, int[] nums2) {
3        
4        int[] seen = new int[1001];
5
6        for (int i = 0; i < nums1.length; i++) {
7            seen[nums1[i]] = 1;
8        }
9
10        ArrayList<Integer> res = new ArrayList<>();
11
12        for (int i = 0; i < nums2.length; i++) {
13            if (seen[nums2[i]] == 1) {
14                res.add(nums2[i]);
15                seen[nums2[i]] = 0;
16            }
17        }
18
19        int[] ans = new int[res.size()];
20        for (int i = 0; i < res.size(); i++) {
21            ans[i] = res.get(i);
22        }
23
24        return ans;
25        
26    }
27}