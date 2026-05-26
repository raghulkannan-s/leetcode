// Last updated: 5/26/2026, 10:48:27 AM
1class Solution {
2    public String largestOddNumber(String num) {
3        
4        int n = num.length();
5        
6        for( int i = n-1; i >=0; i-- ){
7            if( (num.charAt(i)-'0') % 2 != 0 ){
8                return num.substring(0, i+1);
9            }
10        }
11        return "";
12
13    }
14}