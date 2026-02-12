// Last updated: 2/12/2026, 3:15:42 PM
1class Solution {
2    public void merge(int[] nums1, int m, int[] nums2, int n) {
3        
4        int p1 = m-1, p2 = n-1, pm = m+n-1;
5
6        while ( p2>=0 && p1>=0 ){
7            
8            if( nums1[p1] > nums2[p2] ){
9                nums1[pm] = nums1[p1];
10                p1--;
11            }else{
12                nums1[pm] = nums2[p2];
13                p2--;
14            }
15            pm--;
16        }
17
18        while( p2 >= 0 ){
19            nums1[pm] = nums2[p2];
20            pm--;
21            p2--;
22        }
23
24
25    }
26}