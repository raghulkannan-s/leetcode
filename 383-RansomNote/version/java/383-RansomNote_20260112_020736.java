// Last updated: 1/12/2026, 2:07:36 AM
1class Solution {
2    public boolean canConstruct(String coins, String dabba) {
3
4        int[] seen = new int[26];
5
6        for ( char piece : dabba.toCharArray() ){
7            seen[piece - 'a']++;
8        }
9
10        for ( char piece : coins.toCharArray() ){
11            if( seen[piece - 'a'] > 0 ){
12                seen[piece - 'a']--;
13            }
14            else{
15                return false;
16            }
17        }
18
19        return true;
20
21    }
22}