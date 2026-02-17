// Last updated: 2/17/2026, 6:46:06 PM
1class Solution {
2
3    public boolean isPalindrome(String s) {
4        char[] ch = s.toCharArray();
5        return palin( ch, 0, ch.length-1 );
6    }
7
8    public boolean palin(char[] ch, int left, int right){
9
10            if( left >= right ) return true;
11
12            while ( left<right && !Character.isLetterOrDigit(ch[left]) ) left++;
13            while ( left<right && !Character.isLetterOrDigit(ch[right]) ) right--;
14
15            if ( Character.toLowerCase(ch[left]) != Character.toLowerCase(ch[right]) ){
16                return false;
17            }
18
19            return palin( ch, left+1, right-1 );
20    }
21
22}