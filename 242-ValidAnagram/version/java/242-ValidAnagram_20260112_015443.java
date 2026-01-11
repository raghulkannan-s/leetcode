// Last updated: 1/12/2026, 1:54:43 AM
1class Solution {
2    public boolean isAnagram(String s, String t) {
3
4        if( s.length() == 0 || t.length() == 0 ) return false;
5        if( s.length() != t.length() ) return false;
6
7        int[] seen = new int[128];
8
9        for( int i = 0; i < s.length(); i++ ){
10            seen[s.charAt(i)]++;
11            seen[t.charAt(i)]--;
12        }
13
14        for ( int check : seen ){
15            if( check != 0 ) return false;
16        }
17
18        return true;
19
20    }
21}