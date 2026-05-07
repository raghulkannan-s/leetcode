// Last updated: 5/7/2026, 4:21:50 PM
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
11        for( int i = 0; i < n; i++ ){
12            freq[s.charAt(i)-'a']++;
13            freq[t.charAt(i)-'a']--;
14        }
15
16        for( int i : freq ){
17            if( i != 0 ) return false;
18        }
19        return true;
20    }
21}