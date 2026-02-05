// Last updated: 2/5/2026, 10:29:49 AM
1class Solution {
2
3    public boolean checkPalin(String s){
4        int left = 0;
5        int right = s.length()-1;
6        while( left < right ){
7
8            if( s.charAt(left) == s.charAt(right)  ){
9                left++;
10                right--;
11            }else{
12                return false;
13            }
14        }
15        return true;
16
17    }
18
19    public boolean validPalindrome(String s) {
20        boolean flag = true;
21
22        int left = 0;  
23        int right =  s.length()-1;
24
25
26        while( left < right ){
27            
28           if(flag ){
29
30             if( checkPalin(s.substring(left, right)) ){
31                right--;
32                flag = false;
33             }else if( checkPalin(s.substring(left+1, right+1))){
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