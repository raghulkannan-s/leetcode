// Last updated: 2/6/2026, 1:09:09 PM
1class Solution {
2    public int myAtoi(String a) {
3        
4        String s = a.trim();
5
6        boolean isNegative = false;
7        int idx = 0;
8
9        String result = "";
10
11        for( int i = 0; i<s.length(); i++ ){
12            
13            char ch = s.charAt(i);
14
15          if (ch == '-') {
16                isNegative = true;
17                idx = i + 1;
18                break;
19            }
20
21            if (ch == '+') {
22                idx = i + 1;
23                break;
24            }
25
26            if (isDigit(ch)) { 
27                idx = i;
28                break;
29            }
30
31            if (!isDigit(ch)) {
32                return 0;
33            }
34
35        }
36
37
38        for( int i = idx; i<s.length(); i++ ){
39            char ch = s.charAt(i);
40
41            if( !isDigit(ch) ){
42                break;
43            }
44
45            if( isDigit(ch) ){
46                result+=ch;
47            }
48        }
49
50        int res = (int)conv(result, isNegative);
51
52        if( isNegative ){
53            if(res == Integer.MIN_VALUE){
54               return res;
55            }
56            return res*-1;
57        }
58
59        return res;
60
61
62
63    }
64    public long conv(String str, boolean isNeg){
65        long val = 0;
66
67      for( int i = 0; i< str.length(); i++ ){
68
69        int digit = str.charAt(i) - '0';
70
71        if( val > (Integer.MAX_VALUE - digit) / 10 ){
72            if(isNeg){
73                return Integer.MIN_VALUE;
74            }else{
75                return Integer.MAX_VALUE;
76            }
77        }
78
79        val = val * 10 + digit;
80    }
81
82        return val;
83    }
84    
85    public boolean isDigit(char ch){
86        return ( ch >= '0' && ch <= '9' );
87    }
88}