// Last updated: 12/25/2025, 2:44:27 AM
1class Solution {
2    public boolean isAnagram(String s, String t) {
3        if( s.length() != t.length() ) return false;
4
5        int[] seen = new int[128];
6
7        for(int i = 0; i<s.length(); i++){
8            seen[ s.charAt(i)]++;
9            seen[ t.charAt(i)]--;
10        }
11
12        for( int count : seen ){
13            if( count != 0 ) return false;
14        }
15
16        return true;
17
18    }
19}