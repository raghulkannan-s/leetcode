// Last updated: 3/15/2026, 10:44:30 AM
1class Solution {
2    public int strStr(String haystack, String needle) {
3        
4        int n =  needle.length();
5        int h =  haystack.length();
6        if( n == 0 ) return 0;
7        int[] lps = helper(needle);
8        int i = 0; int j = 0;
9
10        while( i < h ){
11            if( haystack.charAt(i) == needle.charAt(j) ){
12                i++; j++;
13                if( j == n ){
14                    return i-j;
15                }
16            }
17            else{
18                if( j != 0 ){
19                    j = lps[j-1];
20                }else{
21                    i++;
22                }
23            }
24        }
25        return -1;
26    }
27
28    private static int[] helper( String s ){
29        int[] lps = new int[s.length()];
30        int len = 0; int i = 1;
31        while( i < s.length() ){
32            if( s.charAt(i) == s.charAt(len) ){
33                len++;
34                lps[i] = len;
35                i++;
36            }
37            else{
38                if( len != 0 ){
39                    len = lps[len-1];
40                } 
41                else{
42                    lps[i] = 0;
43                    i++;
44                }
45            }
46        }
47        return lps;
48    }
49}