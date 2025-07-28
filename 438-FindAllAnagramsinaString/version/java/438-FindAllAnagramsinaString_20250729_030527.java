// Last updated: 7/29/2025, 3:05:27 AM
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        List<Integer> store = new ArrayList<>();
        
        if ( s.length() < p.length() ) return store;

        int[] key = new int[26];
        int[] window = new int[26];

        for ( int i = 0; i < p.length(); i++ ){
            key[ p.charAt(i) - 'a' ]++;
            window[ s.charAt(i) - 'a' ]++;
        }

        if ( Arrays.equals( key, window ) ) store.add(0);

        for ( int i = p.length(); i < s.length(); i++ ){
            window[ s.charAt(i - p.length()) - 'a' ]--;
            window[ s.charAt(i) - 'a' ]++;

            if ( Arrays.equals( key, window ) ) store.add( i - p.length()+1 );
        }
        return store;

    }
}