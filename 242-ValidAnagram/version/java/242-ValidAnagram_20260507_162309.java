// Last updated: 5/7/2026, 4:23:09 PM
1class Solution {
2    public boolean isAnagram(String s, String t) {
3        
4        int n = s.length();
5        int m = t.length();
6
7        if( n != m ) return false;
8
9        int[] freq = new int[26];
10
11        for( char i : s.toCharArray() ){
12            freq[i-'a']++;
13        }
14
15        for( char i : t.toCharArray() ){
16            freq[i-'a']--;
17        }
18
19        for( int i : freq ){
20            if( i != 0 ) return false;
21        }
22        
23        return true;
24
25    }
26}