// Last updated: 2/28/2026, 12:20:30 PM
1import java.math.BigInteger;
2
3class Solution {
4
5    public boolean splitString(String s) {
6        int n = s.length();
7
8        for (int i = 1; i < n; i++) {
9            BigInteger first = new BigInteger(s.substring(0, i));
10            if (dfs(s, i, first)) {
11                return true;
12            }
13        }
14
15        return false;
16    }
17
18    private boolean dfs(String s, int index, BigInteger prev) {
19        if (index == s.length()) {
20            return true;
21        }
22
23        BigInteger num = BigInteger.ZERO;
24
25        for (int i = index; i < s.length(); i++) {
26            num = num.multiply(BigInteger.TEN)
27                     .add(BigInteger.valueOf(s.charAt(i) - '0'));
28
29            if (num.equals(prev.subtract(BigInteger.ONE))) {
30                if (dfs(s, i + 1, num)) {
31                    return true;
32                }
33            }
34
35            if (num.compareTo(prev) >= 0) {
36                break; // pruning
37            }
38        }
39
40        return false;
41    }
42}