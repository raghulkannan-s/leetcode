// Last updated: 4/14/2026, 12:33:22 AM
1class Solution {
2    public double myPow(double x, int N) {
3        long n = N;
4
5        if (n < 0) {
6            x = 1 / x;
7            n = -n;
8        }
9
10        return helper(x, n);
11    }
12
13    private double helper(double x, long n) {
14        if (n == 0) return 1;
15
16        double half = helper(x, n / 2);
17
18        if (n % 2 == 0) {
19            return half * half;
20        } else {
21            return x * half * half;
22        }
23    }
24}