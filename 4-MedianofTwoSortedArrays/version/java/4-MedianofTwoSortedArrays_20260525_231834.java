// Last updated: 5/25/2026, 11:18:34 PM
1class Solution {
2    public double findMedianSortedArrays(int[] a, int[] b) {
3        
4        int n = a.length;
5        int m = b.length;
6
7        if (n > m) return findMedianSortedArrays(b, a);
8
9        double result = 0;
10
11        boolean isEven = false;
12
13        int tot = (n + m)%2;
14        if( tot == 0 ) isEven = true;
15
16        int left = 0;
17        int right = n;
18
19        while( left <= right ){
20            
21            int cut1 = left + (right - left) / 2;
22            int cut2 = ((m + n + 1) / 2) - cut1;
23
24            int l1 = ( cut1 == 0 ) ? Integer.MIN_VALUE : a[cut1-1];
25            int r1 = ( cut1 == n ) ? Integer.MAX_VALUE : a[cut1];
26            int l2 = ( cut2 == 0 ) ? Integer.MIN_VALUE : b[cut2-1];
27            int r2 = ( cut2 == m ) ? Integer.MAX_VALUE : b[cut2];
28
29            if( l1 <= r2 && l2 <= r1 ) {
30                if( isEven ){
31                    return (Math.max( l1, l2 )+Math.min( r1, r2 ))/2.0;
32                }
33                else return Math.max(l1, l2);
34            }
35            else if( l1 > r2 ){
36                right = cut1 - 1;
37            }
38            else{
39                left = cut1+1;
40            }
41
42        }
43
44
45        return result;
46
47    }
48}