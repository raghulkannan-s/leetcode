// Last updated: 6/10/2026, 3:47:28 PM
1class Solution {
2    public String minWindow(String s, String t) {
3        int[] cnt = new int[128];
4        for (char c : t.toCharArray()) cnt[c]++;
5
6        int left = 0, need = t.length();
7        int start = 0, min = Integer.MAX_VALUE;
8
9        for (int right = 0; right < s.length(); right++) {
10            if (cnt[s.charAt(right)]-- > 0) need--;
11
12            while (need == 0) {
13                if (right - left + 1 < min) {
14                    min = right - left + 1;
15                    start = left;
16                }
17
18                if (++cnt[s.charAt(left++)] > 0) need++;
19            }
20        }
21
22        return min == Integer.MAX_VALUE ? "" : s.substring(start, start + min);
23    }
24}