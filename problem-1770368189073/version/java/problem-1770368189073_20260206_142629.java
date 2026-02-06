// Last updated: 2/6/2026, 2:26:29 PM
1class Solution {
2    public int myAtoi(String a) {
3
4        String s = a.trim();
5
6        boolean isNegative = false;
7        int idx = 0;
8        long result = 0;
9
10        if (s.length() < 1)
11            return 0;
12
13        if (s.charAt(0) == '-') {
14            isNegative = true;
15            idx = 1;
16        }
17        if (s.charAt(0) == '+') {
18            idx = 1;
19        }
20
21        for (int i = idx; i < s.length(); i++) {
22            char ch = s.charAt(i);
23
24            if (!isDigit(ch)) {
25                break;
26            }
27
28            if (isDigit(ch)) {
29                int digit = s.charAt(i) - '0';
30
31                if (result > (Integer.MAX_VALUE - digit) / 10) {
32                    if (isNegative) {
33                        return Integer.MIN_VALUE;
34                    } else {
35                        return Integer.MAX_VALUE;
36                    }
37                }
38
39                result = result * 10 + digit;
40            }
41        }
42
43        if (isNegative) {
44            if (result == Integer.MIN_VALUE) {
45                return (int)result;
46            }
47            return (int) result*-1;
48        }
49
50        return (int) result;
51
52    }
53
54
55    public boolean isDigit(char ch) {
56        return (ch >= '0' && ch <= '9');
57    }
58}