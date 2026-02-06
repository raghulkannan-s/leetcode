// Last updated: 2/6/2026, 2:08:20 PM
1class Solution {
2    public int myAtoi(String a) {
3        
4        String s = a.trim();
5
6        boolean isNegative = false;
7        int idx = 0;
8        String result = "";
9
10        if(s.length() < 1) return 0;
11
12        if( s.charAt(0) == '-' ) {
13            isNegative = true;
14            idx = 1;
15        }
16        if( s.charAt(0) == '+' ) {
17            idx = 1;
18        }
19
20
21        for( int i = idx; i<s.length(); i++ ){
22            char ch = s.charAt(i);
23
24            if( !isDigit(ch) ){
25                break;
26            }
27
28            if( isDigit(ch) ){
29                result+=ch;
30            }
31        }
32
33        int res = (int)conv(result, isNegative);
34
35        if( isNegative ){
36            if(res == Integer.MIN_VALUE){
37               return res;
38            }
39            return res*-1;
40        }
41
42        return res;
43
44
45
46    }
47    public long conv(String str, boolean isNeg){
48        long val = 0;
49
50      for( int i = 0; i< str.length(); i++ ){
51
52        int digit = str.charAt(i) - '0';
53
54        if( val > (Integer.MAX_VALUE - digit) / 10 ){
55            if(isNeg){
56                return Integer.MIN_VALUE;
57            }else{
58                return Integer.MAX_VALUE;
59            }
60        }
61
62        val = val * 10 + digit;
63    }
64
65        return val;
66    }
67    
68    public boolean isDigit(char ch){
69        return ( ch >= '0' && ch <= '9' );
70    }
71}