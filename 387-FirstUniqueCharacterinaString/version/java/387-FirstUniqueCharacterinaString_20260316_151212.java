// Last updated: 3/16/2026, 3:12:12 PM
1class Solution {
2    public int firstUniqChar(String s) {
3        int[] seen = new int[26];
4
5        for ( int i = 0; i<s.length(); i++ ){
6            seen[ s.charAt(i) - 'a' ]++;
7        }
8        
9        for ( int i = 0; i<s.length(); i++ ){
10            if( seen[ s.charAt(i) - 'a' ] == 1 ) return i;
11        }
12
13        return -1;
14
15    }
16}