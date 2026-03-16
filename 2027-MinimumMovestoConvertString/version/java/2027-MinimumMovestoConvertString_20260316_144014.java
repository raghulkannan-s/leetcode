// Last updated: 3/16/2026, 2:40:14 PM
1class Solution {
2    public int minimumMoves(String s) {
3
4        int count = 0;
5
6        for( int i = 0; i <s.length(); i++  ){
7
8            if( s.charAt(i) == 'X'){
9                count++;
10                i+=2;
11            }
12        }
13
14
15
16        return count;
17
18    }
19}