// Last updated: 11/19/2025, 9:33:44 PM
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int p1 = m-1, p2 = n-1, pm = m+n-1;

        while ( p2>=0 && p1>=0 ){
            
            if( nums1[p1] > nums2[p2] ){
                nums1[pm] = nums1[p1];
                p1--;
            }else{
                nums1[pm] = nums2[p2];
                p2--;
            }
            pm--;
        }

        while( p2 >= 0 ){
            nums1[pm] = nums2[p2];
            pm--;
            p2--;
        }


    }
}