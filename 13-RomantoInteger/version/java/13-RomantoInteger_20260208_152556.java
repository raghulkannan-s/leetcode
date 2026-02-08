// Last updated: 2/8/2026, 3:25:56 PM
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
23            
24            if( i < s.length()-1 && (key.get(s.charAt(i+1)) > curr)){
25               res-=curr;
26            }else{
27                res+=curr;
28            }
29
30        }
31
32
33        return res;
34
35
36    }
37}