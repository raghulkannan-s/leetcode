// Last updated: 3/7/2026, 11:44:33 AM
1class Solution {
2    public int[] sortEvenOdd(int[] nums) {
3        
4        List<Integer> even = new ArrayList<>();
5        List<Integer> odd = new ArrayList<>();
6
7        for( int i = 0; i<nums.length; i++ ){
8            if( i % 2 == 0 ) even.add(nums[i]);
9            else odd.add(nums[i]);
10        }
11
12        Collections.sort(even);
13        Collections.sort(odd, Collections.reverseOrder());
14
15        int l = 0;
16        int m = 0;
17
18        for( int i = 0; i<nums.length; i++ ){
19            if( i % 2 == 0 ) {
20                nums[i] = even.get(l);
21                l++;
22            }
23            else {
24                nums[i] = odd.get(m);
25                m++;
26            }
27        }
28
29        return nums;
30    }
31}