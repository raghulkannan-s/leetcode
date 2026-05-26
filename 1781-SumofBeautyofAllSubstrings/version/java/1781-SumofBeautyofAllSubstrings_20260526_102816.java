// Last updated: 5/26/2026, 10:28:16 AM
1class Solution {
2    public int beautySum(String s) {
3        
4        int n = s.length();
5        int sum = 0;
6
7        for( int i = 0; i < n; i++){
8            int[] freq = new int[26];
9            for( int j = i; j < n; j++ ){
10                freq[s.charAt(j)-'a']++;
11                
12                int max = Integer.MIN_VALUE;
13                int min = Integer.MAX_VALUE;
14
15                for( int k = 0; k < 26; k++ ){
16                    int val = freq[k];
17                    if( val > 0 ){
18                        if( val > max ) max = val;
19                        if( val < min ) min = val;
20                    }
21                }
22                sum = sum + (max - min);
23            }
24        }
25
26        return sum;
27
28    }
29}