// Last updated: 3/5/2026, 3:07:32 PM
1class Solution {
2    public int[] replaceElements(int[] arr) {
3        int n = arr.length;
4        int[] res = new int[n];
5
6        int max = arr[n-1];
7
8        for( int i = n-1; i>=0; i-- ){
9
10            res[i] = max;
11            max= Math.max(arr[i], max);
12
13        }
14
15        res[n-1] = -1;
16
17        return res;
18    }
19}