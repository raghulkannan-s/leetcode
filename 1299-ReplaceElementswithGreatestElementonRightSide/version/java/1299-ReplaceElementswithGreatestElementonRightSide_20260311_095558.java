// Last updated: 3/11/2026, 9:55:58 AM
1class Solution {
2    public int[] replaceElements(int[] arr) {
3        int n = arr.length;
4        
5        int max = arr[n-1];
6
7        int[] res = new int[n];
8
9        res[n-1] = -1;
10
11        for( int i = n-2; i>=0; i-- ){
12
13            res[i] = max;
14            max = Math.max( max, arr[i] );
15
16        }
17
18
19        return res;
20
21    }
22}