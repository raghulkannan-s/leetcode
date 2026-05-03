// Last updated: 5/3/2026, 9:20:49 AM
1class Solution {
2    public int sumOfPrimesInRange(int n) {
3        int r = 0;
4        int temp = n;
5
6        while( temp > 0 ){
7            r*=10;
8            r+=temp%10;
9            temp/=10;
10        }
11
12        int low = Math.min(r,n);
13        int high = Math.max(r,n);
14
15        int sum = 0;
16
17        for( int i = low; i <= high; i++ ){
18            if(isPrime(i)){
19                sum+=i;
20            }
21        }
22        return sum;
23    }
24
25    private boolean isPrime(int n){
26        if( n <= 1 ) return false;
27        if( n == 2 )return true;
28        if( n % 2 == 0 ) return false;
29
30        for( int i  = 3; i * i <= n; i++ ){
31            if( n % i == 0 ) return false;
32        }
33        return true;
34    }
35}