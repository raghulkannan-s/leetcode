// Last updated: 2/16/2026, 3:54:46 PM
1class Solution {
2    public int minNumberOfFrogs(String s) {
3            int[] count = new int[5];
4            int frogs = 0;
5            int maxFrogs = 0;
6
7            for(char c : s.toCharArray()){
8                int i = "croak".indexOf(c);
9                if( i == 0 ){
10                    count[i]++;
11                    frogs++;
12                    if( frogs > maxFrogs ){
13                        maxFrogs = frogs;
14                    }
15                } else {
16                    if( count[i - 1] == 0 ){
17                        return -1;
18                    }
19                    count[i - 1]--;
20                    if( i == 4 ){
21                        frogs--;
22                    } else {
23                        count[i]++;
24                    }
25                }
26            }
27
28            return frogs == 0 ? maxFrogs : -1;
29
30    }
31}