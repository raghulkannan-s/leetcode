// Last updated: 11/20/2025, 1:52:37 AM
class Solution {
    public int firstUniqChar(String s) {
        int[] seen = new int[26];

        for ( int i = 0; i<s.length(); i++ ){
            seen[ s.charAt(i) - 'a' ]++;
        }
        
        for ( int i = 0; i<s.length(); i++ ){
            if( seen[ s.charAt(i) - 'a' ] == 1 ) return i;
        }

        return -1;

    }
}