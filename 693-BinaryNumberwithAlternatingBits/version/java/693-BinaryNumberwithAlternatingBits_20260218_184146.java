// Last updated: 2/18/2026, 6:41:46 PM
1class Solution {
2    public boolean hasAlternatingBits(int n) {
3        
4        String res = "";
5
6        while( n > 0 ){
7            res += (n%2);
8            n/=2;
9        }
10
11        for( int i =0; i< res.length()-1; i++ ){
12            if( res.charAt(i) == res.charAt(i+1) ) return false;
13        }
14
15        return true;
16
17    }
18}