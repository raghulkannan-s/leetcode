// Last updated: 2/18/2026, 11:10:22 AM
1class Solution {
2    public int romanToInt(String s) {
3
4        Map<Character, Integer> key = Map.of(
5                'I', 1,
6                'V', 5,
7                'X', 10,
8                'L', 50,
9                'C', 100,
10                'D', 500,
11                'M', 1000);
12
13        if (s.length() < 1)
14            return 0;
15
16        int res = 0;
17
18        for (int i = 0; i < s.length(); i++) {
19
20            int curr = key.get(s.charAt(i));
21
22            if (i < s.length() - 1 && (key.get(s.charAt(i + 1)) > curr)) {
23                res -= curr;
24            } else {
25                res += curr;
26            }
27
28        }
29
30        return res;
31
32    }
33}