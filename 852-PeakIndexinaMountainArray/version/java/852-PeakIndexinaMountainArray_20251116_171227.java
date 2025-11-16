// Last updated: 11/16/2025, 5:12:27 PM
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int low = 0, high = arr.length-1;

        while ( low < high ){
            
            int mid =  low + ( high - low )/2;

            if( arr[mid] < arr[mid+1] ) low = mid+1;
            else high = mid;

        }

        return high;

    }
}