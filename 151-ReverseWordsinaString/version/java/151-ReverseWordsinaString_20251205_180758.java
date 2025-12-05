// Last updated: 12/5/2025, 6:07:58 PM
1class Solution {
2    public String reverseWords(String s) {
3        
4        String[] parts = s.trim().split("\\s+");
5        StringBuilder sb = new StringBuilder();
6
7        for ( int i = parts.length-1; i>=0; i-- ){
8            sb.append( parts[i] );
9            if( i>0 ) sb.append(" ");
10        }
11
12        return sb.toString();
13
14    }
15}
16