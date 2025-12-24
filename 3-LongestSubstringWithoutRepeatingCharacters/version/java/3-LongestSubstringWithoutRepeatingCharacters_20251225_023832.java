// Last updated: 12/25/2025, 2:38:32 AM
// done without hashmap
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3
4        int[] map = new int[128];
5
6        for ( int i = 0; i<128; i++ ) map[i] = -1;
7
8        int left = 0;
9        int max = 0;
10
11
12        for ( int right = 0; right<s.length(); right++ ){
13
14            char ch = s.charAt(right);
15
16            if( map[ch] >= left ){
17                left = map[ch]+1;
18            }
19
20            int curr = right - left + 1;
21            if ( curr > max ) max = curr;
22
23            map[ch] = right;
24
25        }
26
27        return max;
28        
29    }
30}