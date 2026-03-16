// Last updated: 3/16/2026, 2:54:38 PM
1class Solution {
2    public String reverseWords(String s) {
3        
4        String[] words = s.trim().split("\\s+");
5
6        int left = 0;
7        int right = words.length-1;
8
9        while( left < right ){
10
11            String temp = words[left];
12            words[left] = words[right];
13            words[right] = temp;
14
15            left++;
16            right--;
17        }
18
19        String res = "";
20
21        for( String word : words ){
22            res = res + word + " ";
23        }
24
25
26        return res.substring(0, res.length()-1);
27
28
29    }
30}