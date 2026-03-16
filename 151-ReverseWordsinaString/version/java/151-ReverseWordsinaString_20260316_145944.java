// Last updated: 3/16/2026, 2:59:44 PM
1class Solution {
2    public String reverseWords(String s) {
3        
4        String[] words = s.trim().split("\\s+");
5        String str = "";
6        
7        for(int i = words.length -1 ; i >= 0 ; i--){
8            if(str.length()!= 0){
9                str += " ";
10            }
11            str += words[i];
12        }
13        return str;
14
15    }
16}