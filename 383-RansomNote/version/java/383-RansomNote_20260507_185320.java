// Last updated: 5/7/2026, 6:53:20 PM
1class Solution {
2    public boolean canConstruct(String ransomNote, String magazine) {
3
4        int n = magazine.length();
5        int m = ransomNote.length();
6
7        if( n < m ) return false;
8
9        int[] freq = new int[26];
10
11        for( char i : magazine.toCharArray() ){
12            freq[i-'a']++;
13        }
14        for( char i : ransomNote.toCharArray() ){
15            freq[i-'a']--;
16        }
17
18        for( int i : freq ){
19            if( i < 0 ) return false;
20        }
21
22        return true;
23    }
24}