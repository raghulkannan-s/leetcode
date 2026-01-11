// Last updated: 1/12/2026, 3:20:43 AM
1class Solution {
2    public List<Integer> findDisappearedNumbers(int[] nums) {
3        
4        List<Integer> res = new ArrayList<>();
5        boolean[] seen = new boolean[nums.length + 1];
6
7        for (int n : nums) {
8            seen[n] = true;
9        }
10
11        for (int i = 1; i <= nums.length; i++) {
12            if (!seen[i]) {
13                res.add(i);
14            }
15        }
16
17        return res;
18
19    }
20}