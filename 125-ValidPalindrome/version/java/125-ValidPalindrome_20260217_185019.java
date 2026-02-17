// Last updated: 2/17/2026, 6:50:19 PM
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
12            if ( !Character.isLetterOrDigit(ch[left]) ) {
13                return palin( ch, left+1, right );
14            }
15            if ( !Character.isLetterOrDigit(ch[right] ) ) {
16                return palin( ch, left, right-1 );
17            }
18
19            if ( Character.toLowerCase(ch[left]) != Character.toLowerCase(ch[right]) ){
20                return false;
21            }
22
23            return palin( ch, left+1, right-1 );
24    }
25
26}