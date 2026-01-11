// Last updated: 1/12/2026, 3:38:09 AM
1class Solution {
2    public List<List<String>> groupAnagrams(String[] strs) {
3        
4        HashMap <String, List<String>> map = new HashMap<>();
5
6        for ( String word : strs){
7            
8            int[] freq = new int[26];
9
10            for ( char letter : word.toCharArray() ){
11                freq[letter-'a']++;
12            }
13
14            StringBuilder generateKey = new StringBuilder();
15
16            for ( int i = 0; i<26; i++ ){
17                generateKey.append("#");
18                generateKey.append(freq[i]);
19            }
20
21            String key = generateKey.toString();
22
23            if ( !map.containsKey(key) ){
24                map.put( key, new ArrayList<>() );
25            }
26
27            map.get(key).add(word);
28
29        }
30
31        return new ArrayList<>(map.values());
32
33    }
34}