// Last updated: 2/11/2026, 5:25:42 PM
1class Solution {
2    public int[] sortedSquares(int[] nums) {
3        
4        int n = nums.length;
5        int[] res = new int[n];
6        
7        int i = 0;
8        int j = n-1;
9
10        int re = n-1;
11
12        while( i <= j ) {
13
14            int start = nums[i]*nums[i];
15            int end = nums[j]*nums[j];
16            
17            if( start > end ){
18                res[re] = start;
19                i++;
20            }else{
21                res[re] = end;
22                j--;
23            }
24
25            re--;
26
27
28        }
29
30
31        return res;
32
33
34    }
35}