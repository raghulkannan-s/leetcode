// Last updated: 5/31/2026, 11:27:35 AM
1class Solution {
2    public int digitFrequencyScore(int temp) {
3        int sum = 0;
4        int[] freq = new int[10];
5
6        int n = temp;
7        while( n > 0 ){
8            int d = n % 10;
9            n/=10;
10            freq[d]++;
11        }
12
13        for( int i = 1; i < 10; i++ ){
14            sum+=(freq[i]*i);
15        }
16
17        return sum;
18
19        
20    }
21}