// Last updated: 3/5/2026, 3:09:20 PM
class Solution {
    public int[] replaceElements(int[] arr) {
        int max = -1;
        for(int i=arr.length-1; i>=0; i--) {
           int cur = arr[i];
           arr[i] = max;
           max = Math.max(max, cur);
        }
        System.gc();
        return arr;
    }
}