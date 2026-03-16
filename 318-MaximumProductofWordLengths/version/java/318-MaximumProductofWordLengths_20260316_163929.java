// Last updated: 3/16/2026, 4:39:29 PM
1class Solution {
2    public int maxProduct(String[] words) {
3        int n = words.length;
4        int[] masks = new int[n];
5        
6        for (int i = 0; i < n; i++)
7            for (char c : words[i].toCharArray())
8                masks[i] |= (1 << (c - 'a'));
9        
10        int max = 0;
11        for (int i = 0; i < n; i++)
12            for (int j = i+1; j < n; j++)
13                if ((masks[i] & masks[j]) == 0)
14                    max = Math.max(max, words[i].length() * words[j].length());
15        
16        return max;
17    }
18}