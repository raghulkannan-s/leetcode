// Last updated: 2/21/2026, 11:56:06 AM
1class Solution {
2    public int totalMoney(int n) {
3
4        int sum = 0;
5        int curr = 1;
6        int mon = 1;
7
8        for( int i = 0; i<n; i++ ){
9
10             if (i % 7 == 0) {
11                curr = mon;
12                mon++;
13            }
14
15            sum += curr;
16            curr++;
17
18        }
19        return sum;
20    }
21}