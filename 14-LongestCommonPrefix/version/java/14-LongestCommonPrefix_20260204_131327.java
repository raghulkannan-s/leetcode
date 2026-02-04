// Last updated: 2/4/2026, 1:13:27 PM
1class Solution {
2    public String longestCommonPrefix(String[] strs) {
3        
4        int n = strs.length;
5
6        if( n == 0 ) return "";
7        if( n == 1 ) return strs[0];
8
9        int minN = strs[0].length();
10
11        for(int i  = 0; i<n; i++){
12            if( strs[i].length() < minN ){
13                minN = strs[i].length();
14            }
15        }
16        String result = "";
17
18        boolean flag = true;
19
20        for( int i = 0;  i<minN; i++){
21
22            char check = strs[0].charAt(i);
23
24            for( int j = 0; j < n; j++ ){
25
26                if( flag && (strs[j].charAt(i) == check) ){
27
28                }else{
29                    return result;
30                }
31
32            }
33
34            result = result + check;
35
36        }
37
38        return result;
39
40
41
42
43    }
44}