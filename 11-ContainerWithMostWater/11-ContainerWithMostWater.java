// Last updated: 7/26/2025, 11:37:01 PM
class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int l = 0;
        int r = height.length - 1;

        while ( l < r ){
            int h = Math.min( height[l], height[r] );
            int w = r - l;
            int a = h*w;
            max = Math.max( max, a);
            if( height[l] < height[r] ){
                l++;
            }else{
                r--;
            }
        }

        return max;
    }
}
