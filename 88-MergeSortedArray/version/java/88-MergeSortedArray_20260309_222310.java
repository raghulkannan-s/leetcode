// Last updated: 3/9/2026, 10:23:10 PM
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
11                nums1[len--] = nums1[first--];
12            } else {
13                nums1[len--] = nums2[second--]; 
14            }
15        }
16        if( second > -1 ){
17             for( int i = second; i>=0; i-- ){
18                nums1[len--] = nums2[i];
19            }
20        }
21
22        
23    }
24}