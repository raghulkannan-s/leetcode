// Last updated: 3/10/2026, 3:37:16 PM
1class Solution {
2    public int minDays(int[] nums, int m, int k) {
3        
4        int n = nums.length;
5
6        int max = 1;
7
8        for( int i : nums){
9            max = Math.max(max, i);
10        }
11
12        if( k*m > n ) return -1;
13
14        int left = 1;
15        int right = max;
16
17
18        int min = -1;
19
20        while( left <= right ){
21            
22            int mid = left + (right-left)/2;
23            if( isPossible(mid, k, m, nums) ){
24                right = mid-1;
25                min = mid;
26            }else{
27                left = mid+1;
28            }
29        }
30        return min;
31    }
32
33    public boolean isPossible(int mid, int flowers, int boq, int[] nums){
34
35        int req =  boq;
36        int count = 0;
37        for( int i : nums ){
38            if( i <= mid ){
39                count++;
40                if( count >= flowers ){
41                    count = 0;
42                    req--;
43                }
44            }else{
45                count = 0;
46            }
47        }
48        if( req <= 0 ) return true;
49        return false; 
50    }
51}