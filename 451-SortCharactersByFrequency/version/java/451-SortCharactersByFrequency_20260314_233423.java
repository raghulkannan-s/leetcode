// Last updated: 3/14/2026, 11:34:23 PM
1import java.util.*;
2
3class Solution {
4    public String frequencySort(String s) {
5
6        Map<Character, Integer> freq = new HashMap<>();
7
8        for (char c : s.toCharArray()) {
9            freq.put(c, freq.getOrDefault(c, 0) + 1);
10        }
11
12        List<Character> list = new ArrayList<>(freq.keySet());
13
14        Collections.sort(list, (a, b) -> freq.get(b) - freq.get(a));
15
16        StringBuilder res = new StringBuilder();
17
18        for (char c : list) {
19            int count = freq.get(c);
20
21            for (int i = 0; i < count; i++) {
22                res.append(c);
23            }
24        }
25
26        return res.toString();
27    }
28}