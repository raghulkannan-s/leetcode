// Last updated: 2/17/2026, 12:27:05 PM
1class Solution {
2    public String arrangeWords(String s) {
3
4        String[] words = s.toLowerCase().split(" ");
5        List<String>[] bucket = new ArrayList[101];
6
7        for (String word : words) {
8            int len = word.length();
9            if (bucket[len] == null) {
10                bucket[len] = new ArrayList<>();
11            }
12            bucket[len].add(word);
13        }
14
15        StringBuilder result = new StringBuilder();
16
17        for (int i = 1; i <= 100; i++) {
18            if (bucket[i] != null) {
19                for (String word : bucket[i]) {
20                    result.append(word).append(" ");
21                }
22            }
23        }
24
25        result.setCharAt(0, Character.toUpperCase(result.charAt(0)));
26
27        return result.toString().trim();
28    }
29}
30