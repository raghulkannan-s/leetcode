// Last updated: 3/10/2026, 3:29:47 PM
1class Solution {
2    public int minDays(int[] nums, int m, int k) {
3        
4        int n = nums.length;
5
6        int left = 1;
7        int right = left;
8
9        for( int i : nums){
10            right = Math.max(right, i);
11        }
12
13        if( n < (long)m*k ) return -1;
14
15        int min = right;
16
17        while( left <= right ){
18            
19            int mid = left + (right-left)/2;
20            if( isPossible(mid, k, m, nums) ){
21                right = mid-1;
22                min = mid;
23            }else{
24                left = mid+1;
25            }
26        }
27        return min;
28    }
29
30    public boolean isPossible(int mid, int flowers, int boq, int[] nums){
31
32        int req =  boq;
33        int count = 0;
34        for( int i : nums ){
35            if( i <= mid ){
36                count++;
37                if( count >= flowers ){
38                    count = 0;
39                    req--;
40                }
41            }else{
42                count = 0;
43            }
44        }
45        if( req <= 0 ) return true;
46        return false; 
47    }
48}