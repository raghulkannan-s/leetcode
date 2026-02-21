// Last updated: 2/21/2026, 11:53:07 AM
1class Solution {
2    public int totalMoney(int n) {
3
4        int sum = 0;
5        int curr = 1;
6        int mon = 0;
7
8        for( int i = 0; i<n; i++ ){
9
10            if( i%7 == 0 ){
11                sum+=mon+1;
12                mon++;
13                curr = mon;
14            }else{
15                sum = sum+(curr+1);
16                curr++;
17            }
18
19        }
20        return sum;
21    }
22}