// Last updated: 2/17/2026, 12:23:10 PM
1class Solution {
2    public String arrangeWords(String s) {
3    s = s.toLowerCase();
4        String[] words = s.split(" ");
5
6        Arrays.sort(words, (a, b) -> a.length() - b.length());
7        words[0] = ""+ Character.toUpperCase(words[0].charAt(0)) + words[0].substring(1);
8        StringBuilder res = new StringBuilder();
9        
10        for( int i = 0; i<words.length; i++ ){
11            res.append(words[i]);
12            if( i < words.length-1 ){
13                res.append(" ");
14            }
15        }
16        return res.toString();
17    }
18}