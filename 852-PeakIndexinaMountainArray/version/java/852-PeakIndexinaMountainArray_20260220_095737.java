// Last updated: 2/20/2026, 9:57:37 AM
class Solution {
    public int peakIndexInMountainArray(int[] arr) 
    {
        int low=0,high=arr.length-1;
        while(low<high)
        {
            int mid=(low+high)/2;
            if(arr[mid]<arr[mid+1]) low=mid+1;
            else high=mid;
        }
        return low;
    }
}