// Last updated: 2/8/2026, 10:11:03 PM
1class Solution {
2    public int fib(int n) {
3      if( n < 2 ) return n;
4      return fib(n-1) + fib(n-2);
5
6    }
7}