// Last updated: 3/31/2026, 3:38:15 PM
1class Solution {
2    public int totalMoney(int n) {
3
4        int sum = 0;
5        int curr = 1;
6        int mon = 1;
7
8        for( int i = 0; i<n; i++ ){
9            if (i % 7 == 0) {
10                curr = mon;
11                mon++;
12            }
13            sum += curr;
14            curr++;
15        }
16        return sum;
17    }
18}