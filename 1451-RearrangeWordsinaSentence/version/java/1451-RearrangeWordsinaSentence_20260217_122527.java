// Last updated: 2/17/2026, 12:25:27 PM
1class Solution {
2    public String arrangeWords(String s) {
3    
4        String[] words = s.toLowerCase().split(" ");
5        Arrays.sort(words, (a, b) -> a.length() - b.length());
6        words[0] = Character.toUpperCase(words[0].charAt(0)) + words[0].substring(1);
7        return String.join(" ", words);
8    }
9}