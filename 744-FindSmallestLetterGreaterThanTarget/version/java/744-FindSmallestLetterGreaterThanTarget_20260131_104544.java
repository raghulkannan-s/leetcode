// Last updated: 1/31/2026, 10:45:44 AM
1class Solution {
2    public char nextGreatestLetter(char[] letters, char target) {
3        for( char ch : letters )
4        if( ch > target ) return ch;
5
6        return letters[0];
7    }
8}