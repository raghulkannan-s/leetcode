// Last updated: 2/20/2026, 9:55:18 AM
1class Solution {
2    public int peakIndexInMountainArray(int[] arr) {
3        
4        int left = 1; int right = arr.length-2;
5
6        while( left < right ){
7
8            int mid = right + left/2;
9
10            if( arr[mid-1] < arr[mid] && arr[mid] > arr[mid+1] ) return right;
11            else if( arr[mid+1] > arr[mid] ) left = mid+1;
12            else right = mid-1;
13
14        }
15
16
17        return right;
18
19    }
20}