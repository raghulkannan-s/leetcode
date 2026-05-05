// Last updated: 5/5/2026, 3:54:47 PM
1class Solution {
2    public int mySqrt(int x) {
3        
4        int left = 1;
5        int right = x/2;
6        int ans = 1;
7
8        if( x < 2 ) return x;
9
10        while ( left <= right ){
11
12            long mid = left + (right-left) /2;
13
14            if( (long) (mid*mid) == x ) return (int) mid;
15
16            else if( (long)( mid*mid ) < x ){
17                ans = (int) mid;
18                left = (int) (mid+1);
19            }
20            else{
21                right = (int) (mid-1);
22            }
23        }
24
25        return ans;
26
27
28
29    }
30}