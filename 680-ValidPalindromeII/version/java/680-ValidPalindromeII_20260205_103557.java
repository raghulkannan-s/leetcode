// Last updated: 2/5/2026, 10:35:57 AM
1class Solution {
2
3    public boolean checkPalin(String s, int left, int right){
4
5        while( left < right ){
6
7            if( s.charAt(left) == s.charAt(right)  ){
8                left++;
9                right--;
10            }else{
11                return false;
12            }
13        }
14        return true;
15
16    }
17
18    public boolean validPalindrome(String s) {
19
20        boolean flag = true;
21
22        int left = 0;  
23        int right =  s.length()-1;
24
25
26        while( left < right ){
27            
28           if(flag && (s.charAt(left) != s.charAt(right))){
29
30             if( checkPalin(s, left, right-1) ){
31                right--;
32                flag = false;
33             }else if( checkPalin(s, left+1, right)){
34                left++;
35                flag = false;
36             }
37
38           }
39
40            if( s.charAt(left) == s.charAt(right) ){
41                left++;
42                right--;
43            }
44            else{
45                return false;
46            }
47            
48        }
49
50        return true;
51    }
52}