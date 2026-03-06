// Last updated: 3/6/2026, 3:07:37 PM
1class Solution {
2    public String decodeString(String s) {
3        
4        Stack<Integer> curr = new Stack<>();
5        Stack<StringBuilder> sb = new Stack<>();
6        
7        int currVal = 0;
8
9        StringBuilder res = new StringBuilder();
10        int n = s.length();
11
12        for( int i = 0; i<n; i++ ){
13
14            char ch = s.charAt(i);
15
16            if( isInteger(ch) ) currVal = currVal*10 + ch-'0';
17                               
18            else if( ch == '[' ){
19                curr.push(currVal);
20                currVal = 0;
21                sb.push(res);
22                res = new StringBuilder();
23            }
24
25            else if( ch == ']' ){
26                int currStVal = curr.pop();
27                res.append(res.toString().repeat(currStVal-1));
28                res = sb.pop().append(res);
29            }
30            else {
31                res.append(ch);
32            }
33        }
34
35        return res.toString();
36
37
38
39    }
40
41    public static boolean isInteger(char ch) {
42        try {
43            Integer.parseInt(""+ch);
44            return true;
45        } catch (NumberFormatException e) {
46            return false;
47        }
48    }
49}