// Last updated: 2/8/2026, 3:21:21 PM
1class Solution {
2    public int romanToInt(String s) {
3        
4       Map<Character, Integer> key = Map.of(
5    'I', 1,
6    'V', 5,
7    'X', 10,
8    'L', 50,
9    'C', 100,
10    'D', 500,
11    'M', 1000
12);
13
14
15        if( s.length() < 1 ) return 0;
16        if( s.length() == 1 ) return key.get(s.charAt(0));
17        
18        int res = 0;
19
20        for(  int i = 0; i <s.length(); i++){
21
22            int curr = key.get(s.charAt(i));
23            if( i < s.length()-1 ){
24                int next = key.get(s.charAt(i+1));
25
26                if( next > curr ){
27                res = res + ( next - curr );
28                i++;
29                }
30                else{
31                    res+=curr;
32                }
33            }else{
34                res+=curr;
35            }
36
37
38        }
39
40
41        return res;
42
43
44    }
45}