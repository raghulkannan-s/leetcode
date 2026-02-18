// Last updated: 2/18/2026, 10:30:53 AM
1class Solution {
2    public List<Integer> findAnagrams(String s, String p) {
3        
4        int n = s.length();
5        int m = p.length();
6
7        List<Integer> res = new ArrayList<>();
8
9        if( n < m ) return res;
10
11        int[] base = new int[26];
12        int[] freq = new int[26];
13
14        for( int i = 0; i<m; i++ ){
15            base[p.charAt(i)-'a']++;
16            freq[s.charAt(i)-'a']++;
17        }
18
19        for( int i = 0; i<=n-m; i++ ){
20            
21            if( Arrays.equals(freq, base) ) res.add(i);
22            freq[s.charAt(i)-'a']--;
23            if( i<n-m ){
24                freq[s.charAt(i+m)-'a']++;
25            }
26
27        }
28
29        return res;
30    }
31}