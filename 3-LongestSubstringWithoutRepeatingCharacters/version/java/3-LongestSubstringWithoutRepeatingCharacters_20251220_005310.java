// Last updated: 12/20/2025, 12:53:10 AM
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        
4        int left = 0;
5        int max = 0;
6        HashMap<Character, Integer> cmap = new HashMap<>();
7
8        for ( int right = 0; right<s.length(); right++ ){
9
10            Character ch = s.charAt(right);
11
12            if ( cmap.containsKey(ch) && cmap.get(ch) >=left){
13                left = cmap.get(ch)+1;
14            }
15            int currLen = right-left+1;
16
17            if ( currLen > max ){
18                max = currLen;
19            }
20
21            cmap.put( ch, right );
22
23        }
24
25        return max;
26
27
28    }
29}