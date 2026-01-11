// Last updated: 1/12/2026, 3:19:24 AM
1class Solution {
2    public List<Integer> findDisappearedNumbers(int[] nums) {
3        
4        ArrayList<Integer> res = new ArrayList<>();
5
6        for ( int i = 0; i<nums.length; i++ ){
7            int idx = Math.abs(nums[i]) - 1;
8            if (nums[idx] > 0) {
9                nums[idx] = -nums[idx];
10            }
11        }
12
13        for (int i = 0; i < nums.length; i++) {
14            if (nums[i] > 0) {
15                res.add(i + 1);
16            }
17        }
18
19        return res;
20
21    }
22}