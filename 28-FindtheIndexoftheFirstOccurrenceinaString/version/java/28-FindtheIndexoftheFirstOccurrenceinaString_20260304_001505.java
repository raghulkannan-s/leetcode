// Last updated: 3/4/2026, 12:15:05 AM
1class Solution {
2    public int strStr(String haystack, String needle) {
3        
4        int n =  needle.length();
5        int h =  haystack.length();
6
7        if( n == 0 ) return 0;
8
9        int[] lps = helper(needle);
10
11        int i = 0;
12        int j = 0;
13
14        while( i < h ){
15
16            if( haystack.charAt(i) == needle.charAt(j) ){
17                i++;
18                j++;
19
20                if( j == n ){
21                    return i-j;
22                }
23            }
24            else{
25                if( j != 0 ){
26                    j = lps[j-1];
27                }else{
28                    i++;
29                }
30            }
31
32        }
33
34        return -1;
35    }
36
37    private static int[] helper( String s ){
38
39        int[] lps = new int[s.length()];
40
41        int len = 0;
42        int i = 1;
43
44        while( i < s.length() ){
45
46            if( s.charAt(i) == s.charAt(len) ){
47                len++;
48                lps[i] = len;
49                i++;
50            }
51            else{
52                if( len != 0 ){
53                    len = lps[len-1];
54                } 
55                else{
56                    lps[i] = 0;
57                    i++;
58                }
59            }
60
61        }
62
63
64        return lps;
65
66    }
67}