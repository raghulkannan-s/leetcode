// Last updated: 5/25/2026, 11:48:03 PM
1class Solution {
2    public boolean isIsomorphic(String s, String t) {
3
4        int[] posS = new int[256];
5        int[] posT = new int[256];
6        
7        int n = s.length();
8        
9        for (int i = 0; i < n; i++) {
10            char charS = s.charAt(i);
11            char charT = t.charAt(i);
12            
13            if (posS[charS] != posT[charT]) {
14                return false;
15            }
16            posS[charS] = i + 1;
17            posT[charT] = i + 1;
18        }
19        
20        return true;
21    }
22}