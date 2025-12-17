// Last updated: 12/18/2025, 12:17:27 AM
1class Solution {
2
3    public boolean isPalindrome(String s) {
4       char[] ch = s.toCharArray();
5       int left = 0; 
6       int right = ch.length -1;
7
8       while ( left < right ){
9
10            while ( left<right && !Character.isLetterOrDigit(ch[left]) ) left++;
11            while ( left<right && !Character.isLetterOrDigit(ch[right]) ) right--;
12
13            if ( Character.toLowerCase(ch[left]) != Character.toLowerCase(ch[right]) ){
14                return false;
15            }
16
17            left++;
18            right--;
19       }
20
21       return true;
22    }
23}