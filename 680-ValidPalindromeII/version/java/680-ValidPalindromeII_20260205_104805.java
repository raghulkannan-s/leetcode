// Last updated: 2/5/2026, 10:48:05 AM
1class Solution {
2
3    public boolean validPalindrome(String s) {
4        int left = 0;  
5        int right =  s.length()-1;
6
7        while( left < right ){
8
9            if( s.charAt(left) == s.charAt(right) ){
10                left++;
11                right--;
12            }
13            else{
14                return checkPalin(s, left, right-1) || checkPalin(s, left+1, right);
15            }
16        }
17
18        return true;
19    }
20
21    public boolean checkPalin(String s, int left, int right){
22
23        while( left < right ){
24
25            if( s.charAt(left) == s.charAt(right)  ){
26                left++;
27                right--;
28            }else{
29                return false;
30            }
31        }
32        return true;
33
34    }
35}