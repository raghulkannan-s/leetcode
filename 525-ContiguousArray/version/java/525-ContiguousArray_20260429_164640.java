// Last updated: 4/29/2026, 4:46:40 PM
1class Solution {
2    public int findMaxLength(int[] nums) {
3        int n = nums.length;
4        
5        int sum = 0;
6        int maxLength = 0;
7
8        Map<Integer, Integer> map = new HashMap<>();
9        map.put( 0, -1);
10
11        for( int i = 0; i < n; i++ ){
12
13            sum += ( nums[i] == 1 )?1: -1;
14
15            if( map.containsKey(sum) ){
16                maxLength = Math.max( maxLength, i - map.get( sum ) );
17            }
18            else{
19                map.put( sum, i );
20            }
21
22        }
23
24        return maxLength;
25
26
27    }
28}