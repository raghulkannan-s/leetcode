// Last updated: 5/8/2026, 12:45:38 PM
1class Solution {
2
3    public String minWindow(String s, String t) {
4
5        // frequency needed
6        HashMap<Character, Integer> need = new HashMap<>();
7
8        for(char c : t.toCharArray()) {
9            need.put(c, need.getOrDefault(c, 0) + 1);
10        }
11
12        // current window frequency
13        HashMap<Character, Integer> window = new HashMap<>();
14
15        int left = 0;
16
17        // how many chars fully matched
18        int matched = 0;
19
20        // total unique chars needed
21        int required = need.size();
22
23        // best window
24        int minLen = Integer.MAX_VALUE;
25
26        int start = 0;
27
28        // expand window
29        for(int right = 0; right < s.length(); right++) {
30
31            char c = s.charAt(right);
32
33            // add current char to window
34            window.put(c,
35                window.getOrDefault(c, 0) + 1);
36
37            // frequency requirement satisfied
38            if(need.containsKey(c) &&
39               window.get(c).intValue()
40               == need.get(c).intValue()) {
41
42                matched++;
43            }
44
45            // valid window found
46            while(matched == required) {
47
48                // update minimum answer
49                if(right - left + 1 < minLen) {
50
51                    minLen = right - left + 1;
52
53                    start = left;
54                }
55
56                // shrink window
57                char remove = s.charAt(left);
58
59                window.put(remove,
60                    window.get(remove) - 1);
61
62                // validity broken
63                if(need.containsKey(remove) &&
64                   window.get(remove)
65                   < need.get(remove)) {
66
67                    matched--;
68                }
69
70                left++;
71            }
72        }
73
74        // no valid window
75        if(minLen == Integer.MAX_VALUE) {
76            return "";
77        }
78
79        return s.substring(start, start + minLen);
80    }
81}