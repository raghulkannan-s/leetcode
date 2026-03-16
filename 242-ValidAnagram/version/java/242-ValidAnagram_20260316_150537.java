// Last updated: 3/16/2026, 3:05:37 PM
1class Solution {
2    public boolean isAnagram(String s, String t) {
3        
4        if( s.length() != t.length() ) return false;
5
6        int[] freq = new int[26];
7
8        for( int i = 0; i < s.length(); i++ ){
9            freq[s.charAt(i)-'a']++;
10            freq[t.charAt(i)-'a']--;
11        }
12
13
14        for( int i : freq ){
15            if( i != 0 ) return false;
16        }
17
18        return true;
19
20
21
22    }
23}