// Last updated: 3/5/2026, 6:04:10 PM
1class Solution {
2    public int[] rearrangeArray(int[] nums) {
3        int n = nums.length;
4        int[] res = new int[n];
5        
6        int i = 0, j= 1;
7
8        for( int k = 0; k<n; k++ ){
9
10            if( nums[k] > 0 ){
11                res[i] = nums[k];
12                i=i+2;
13            }
14            else{
15                res[j] = nums[k];
16                j+=2;
17            }
18
19
20
21        }
22        
23        return res;
24    }
25}