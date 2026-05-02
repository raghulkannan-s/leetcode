// Last updated: 5/2/2026, 12:57:21 PM
1class Solution {
2    public int lengthOfLIS(int[] nums) {
3        int n = nums.length;
4        
5        List<Integer> arr = new ArrayList<>();
6
7        for( int element : nums ){
8            int index = Collections.binarySearch(arr, element);
9
10            if( index < 0 ){
11                index = -(index + 1);
12            }
13
14            if( index == arr.size() ) arr.add(element);
15            else arr.set( index, element );
16
17        }
18
19        return arr.size();
20
21
22    }
23}