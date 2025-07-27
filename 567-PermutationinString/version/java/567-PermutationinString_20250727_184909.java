// Last updated: 7/27/2025, 6:49:09 PM
class Solution {

    public boolean checkInclusion(String s1, String s2) {
        
        if (s1.length() > s2.length()) return false;

        int[] key = getFreq( s1 ); 
        int[] window = getFreq( s2.substring(0, s1.length()) );

        if( Arrays.equals(key, window) ) return true;
        
        for ( int i = s1.length(); i < s2.length() ; i++ ){
            
            window[ s2.charAt( i-s1.length() ) - 'a' ]--;
            window[ s2.charAt( i ) - 'a' ]++;

            if( Arrays.equals( key, window ) ) return true; 
        
        }
        return false;
    }

    private int[] getFreq( String s ){
            
            int[] freq = new int[26];

            for( char c : s.toCharArray()){
                freq[ c - 'a' ]++;
            }            
            
            return freq;
        };
}