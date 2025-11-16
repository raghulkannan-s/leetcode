// Last updated: 11/16/2025, 8:14:03 PM
class Solution {
    public List<Integer> findPeaks(int[] arr) {
        ArrayList<Integer> peaks = new ArrayList<>();

        for( int i = 1; i<arr.length-1; i++ ){
            if( arr[i-1] < arr[i] && arr[i] > arr[i+1] ) peaks.add(i);
        }

        return peaks;
        
    }
}