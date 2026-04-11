// Last updated: 4/11/2026, 8:10:01 PM
1class Solution {
2    public int countDigitOccurrences(int[] nums, int digit) {
3
4        int count = 0;
5    
6        for( int i : nums ){
7            
8            if( i == 0 && digit == 0 ){
9                count++;
10                continue;
11            }
12            while( i > 0 ){
13
14                int d = i%10;
15                if( d == digit ){
16                    count++;
17                }
18                i/=10;
19            }
20        }
21        return count;
22        
23    }
24}