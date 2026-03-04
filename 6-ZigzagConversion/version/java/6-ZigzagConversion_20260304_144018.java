// Last updated: 3/4/2026, 2:40:18 PM
1class Solution {
2    public String convert(String s, int numRows) {
3
4        if (numRows == 1) return s;
5
6        List<StringBuilder> res = new ArrayList<>();
7        for (int i = 0; i < numRows; i++) {
8            res.add(new StringBuilder());
9        }
10
11        boolean dir = false;
12        int curr = 0;
13
14        for (int i = 0; i < s.length(); i++) {
15            res.get(curr).append(s.charAt(i));
16
17            if (curr == 0 || curr == numRows - 1) dir = !dir;
18
19            curr += dir ? 1 : -1;
20        }
21
22        StringBuilder result = new StringBuilder();
23        for (StringBuilder sb : res) {
24            result.append(sb);
25        }
26
27        return result.toString();
28    }
29}