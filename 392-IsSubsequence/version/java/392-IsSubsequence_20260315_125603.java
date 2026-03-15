// Last updated: 3/15/2026, 12:56:03 PM
1class Solution {
2    public boolean isSubsequence(String s, String t) {
3        int idx = 0;
4        for (int i = 0; i < t.length(); i++) {
5            if (idx < s.length() && t.charAt(i) == s.charAt(idx)) {
6                idx++;
7            }
8        }
9        return idx == s.length();
10    }
11}