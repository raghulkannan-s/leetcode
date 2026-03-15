// Last updated: 3/16/2026, 12:04:38 AM
1class Solution {
2    public int countPrimes(int n) {
3        
4        if( n<2 ) return 0;
5
6        boolean[] primes = new boolean[n];
7        Arrays.fill(primes, true);
8        primes[0] = false; 
9        primes[1] = false; 
10
11
12        for (int i = 2; i * i < n; i++) {
13            if (primes[i]) {
14                for (int j = i * i; j < n; j += i) {
15                    primes[j] = false;
16                }
17            }
18        }
19
20        int count = 0;
21
22        for( boolean p : primes ){
23            if( p ) count++;
24            
25        }
26
27        return count;
28    }
29}