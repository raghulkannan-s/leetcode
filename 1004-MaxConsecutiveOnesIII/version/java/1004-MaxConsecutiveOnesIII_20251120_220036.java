// Last updated: 11/20/2025, 10:00:36 PM
class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length-1;
        int maxArea = 0;

        while ( left < right ){

            int shorter = Math.min( height[left] , height[right] );
            int area = ( right - left ) * shorter;

            if ( area > maxArea ) maxArea = area;
            
            if ( height[left] < height[right] ) left++;
            else right--;

        }

        return maxArea;


    }
}