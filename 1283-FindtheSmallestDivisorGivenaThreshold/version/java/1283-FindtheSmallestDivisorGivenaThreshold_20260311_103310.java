// Last updated: 3/11/2026, 10:33:10 AM
1class Solution {
2    public int smallestDivisor(int[] nums, int threshold) {
3        
4        int max = Integer.MIN_VALUE;
5        for( int i : nums ){
6            if( i > max ) max = i;
7        }
8
9        int left = 1;
10        int right = max;
11
12        int min = 0;
13
14        while( left <= right ){
15
16            int mid = left + (right-left)/2;
17
18            if( isPossible( mid, threshold, nums ) ){
19                right = mid-1;
20                min = mid;
21            }else{
22                left = mid+1;
23            }
24        }
25        return min;
26
27    }
28
29    public boolean isPossible( int divisor, int threshold, int[] nums ){
30
31        int sum = 0;
32
33        for( int i : nums ){
34            int val = (i+divisor-1)/divisor;
35            sum+=val;     
36        }
37
38        if( sum > threshold ) return false;
39        return true;
40
41
42    }
43
44
45}