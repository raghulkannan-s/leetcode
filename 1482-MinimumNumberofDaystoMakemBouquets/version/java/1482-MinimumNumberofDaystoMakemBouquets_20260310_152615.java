// Last updated: 3/10/2026, 3:26:15 PM
1class Solution {
2    public int minDays(int[] nums, int m, int k) {
3        
4        int n = nums.length;
5
6        System.out.println(n);
7        System.out.println( m*k + "--  req");
8
9        int left = Arrays.stream(nums).min().getAsInt();
10        int right = Arrays.stream(nums).max().getAsInt();
11
12        if( n < (long)m*k ) return -1;
13
14        int min = right;
15
16        while( left <= right ){
17            
18            int mid = left + (right-left)/2;
19            if( isPossible(mid, k, m, nums) ){
20                right = mid-1;
21                min = mid;
22            }else{
23                left = mid+1;
24            }
25        }
26        return min;
27
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