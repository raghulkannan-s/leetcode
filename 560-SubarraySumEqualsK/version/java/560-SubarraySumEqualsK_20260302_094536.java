// Last updated: 3/2/2026, 9:45:36 AM
1
2class Solution {
3    public int subarraySum(int[] nums, int k) {
4        int count = 0;
5        int sum = 0;
6        Map<Integer, Integer> map = new HashMap<>();
7
8        map.put(0, 1);
9
10        for ( int num : nums ){
11            sum+=num;
12            int target = sum - k;
13
14            if ( map.containsKey(target) ){
15                count+= map.get(target);
16            }
17
18            map.put( sum, map.getOrDefault( sum, 0 )+1 );
19        }
20
21        return count;
22
23
24    }
25}