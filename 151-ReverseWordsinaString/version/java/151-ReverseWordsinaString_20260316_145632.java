// Last updated: 3/16/2026, 2:56:32 PM
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
19        return String.join(" ", words);
20
21    }
22}