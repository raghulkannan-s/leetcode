// Last updated: 7/26/2025, 5:23:34 PM
// Implemented in Java from python
class Solution {
    public boolean isPalindrome(String s) {
        
        int l = 0; 
        int r = s.length() - 1;
        
        while( l < r ){
            while ( l<r && !Character.isLetterOrDigit(s.charAt(l))) l++;
            while ( l<r && !Character.isLetterOrDigit(s.charAt(r))) r--;
            if( Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r)) ){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}