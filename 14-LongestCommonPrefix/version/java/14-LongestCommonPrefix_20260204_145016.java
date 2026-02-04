// Last updated: 2/4/2026, 2:50:16 PM
1class Solution {
2    public int[] plusOne(int[] digits) {
3        
4        int n = digits.length;
5        
6
7        for( int i =  n-1; i>=0; i-- ){
8            
9            if( digits[i] < 9 ){
10                digits[i]++;
11                return digits;
12            }
13                digits[i] = 0;
14        }
15
16        int[] result = new int[n+1];
17        result[0] = 1;
18
19        return result;
20    }
21}