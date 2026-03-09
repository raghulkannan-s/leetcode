// Last updated: 3/9/2026, 10:22:00 PM
1class Solution {
2    public void merge(int[] nums1, int m, int[] nums2, int n) {
3        
4        int len = nums1.length-1;
5        int first = m-1;
6        int second = n-1;
7
8
9        while( first >= 0 && second >= 0 ){
10            if( nums1[first] > nums2[second] ){
11                nums1[len] = nums1[first];
12                len--;
13                first--;
14            } else {
15                nums1[len] = nums2[second];
16                len--;
17                second--;
18            }
19        }
20        if( first > -1 ){
21            for( int i = first; i>=0; i-- ){
22                nums1[len] = nums1[i];
23                len--;
24            }
25        }else if( second > -1 ){
26             for( int i = second; i>=0; i-- ){
27                nums1[len] = nums2[i];
28                len--;
29            }
30        }
31
32        
33    }
34}