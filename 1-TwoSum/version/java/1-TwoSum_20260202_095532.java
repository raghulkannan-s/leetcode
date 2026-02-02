// Last updated: 2/2/2026, 9:55:32 AM
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3       
4        HashMap<Integer, Integer> seen = new HashMap<>();
5
6        for( int i = 0; i<nums.length; i++ ){
7
8            int look = target-nums[i];
9
10            if( seen.containsKey(look) ){
11                return new int[] {i, seen.get(look)};
12            }
13
14            seen.put( nums[i], i );
15        }
16
17        return new int[] {0, 1};
18
19    }
20}