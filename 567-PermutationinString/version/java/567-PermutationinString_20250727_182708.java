// Last updated: 7/27/2025, 6:27:08 PM
class Solution {
    
    public boolean checkInclusion(String s1, String s2) {
        
        int[] key = getFreq( s1 ); 

        for ( int i = 0; i <=  s2.length() - s1.length() ; i++ ){
            
            int[] windowFreq = getFreq( s2.substring( i, i + s1.length() ) );

            if( Arrays.equals( key, windowFreq ) ){
                return true;
            }
        
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