// Last updated: 7/24/2025, 4:33:15 PM
// Hashing in Java
class Solution {
    public boolean isAnagram(String s, String t) {
        int[] count = new int[26];
        
        for ( char c : s.toCharArray() ){
            count[ c - 'a' ]++;
        }
        for ( char c : t.toCharArray() ){
            count[ c - 'a' ]--;
        }

        for (int i = 0; i<26; i++){
            if ( count[i] != 0){
                return false;
            }
        }
        return true;

    }
}