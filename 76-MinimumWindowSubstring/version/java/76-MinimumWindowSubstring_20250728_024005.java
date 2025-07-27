// Last updated: 7/28/2025, 2:40:05 AM
class Solution {
    public boolean canConstruct(String a, String b) {

        int[] freq = new int[26];

        for ( int i = 0; i<b.length(); i++ ){
            freq[ b.charAt(i) - 'a' ]++;
        }
        
        for ( int i = 0; i<a.length(); i++ ){
            if( freq[ a.charAt(i) - 'a' ] > 0 ){
                freq[ a.charAt(i) - 'a' ]--;
            }else{
                return false;
            }
        }
        return true;

    }
}