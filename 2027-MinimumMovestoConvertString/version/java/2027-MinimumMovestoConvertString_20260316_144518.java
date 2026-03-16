// Last updated: 3/16/2026, 2:45:18 PM
1class Solution {
2    public int minimumMoves(String s) {
3        
4        int count = 0;
5
6        for( int i = 0; i <s.length(); i++  ){
7
8            if( s.charAt(i) == 'X' ){
9                count++;
10                int change = 2;
11                while( i < s.length() && change-- > 0 ){
12                    i++;
13                }
14            }
15        }
16
17
18
19        return count;
20
21    }
22}
23