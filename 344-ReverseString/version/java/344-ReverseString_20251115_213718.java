// Last updated: 11/15/2025, 9:37:18 PM
class Solution {
    public void reverseString(char[] s) {

        int n = s.length;
        if( n == 1 ) return;

        int left = 0, right = n-1;
        char temp;

        while( left < right ){

            temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;

        }

        return;

    }
}