// Last updated: 3/5/2026, 10:30:36 AM
1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3        
4        int n = nums.length;
5
6        int[] prefix = new int[n];
7        int[] suffix = new int[n];
8
9        prefix[0] = nums[0];
10        suffix[n-1] = nums[n-1];
11
12        for( int i = 0; i<n; i++ ){
13            if( i == 0 ) {
14                prefix[i] = nums[i];
15            }else{
16                prefix[i] = prefix[i-1]*nums[i];
17            }
18        }
19        for( int i = n-1; i>=0; i-- ){
20            if( i == n-1 ) {
21                suffix[i] = nums[i];
22            }else{
23                suffix[i] = suffix[i+1]*nums[i];
24            }
25        }
26
27        for( int i = 0; i<n; i++ ){
28            if( i == 0 ){
29                nums[i] = 1*suffix[i+1];
30            }else if( i == n-1 ){
31                nums[i] = 1*prefix[i-1];
32            }else{
33                nums[i] = prefix[i-1]*suffix[i+1];
34            }
35        }
36
37        return nums;
38
39    }
40}