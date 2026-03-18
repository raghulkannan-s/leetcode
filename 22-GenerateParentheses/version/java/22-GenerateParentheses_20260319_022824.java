// Last updated: 3/19/2026, 2:28:24 AM
1class Solution {
2    public List<String> generateParenthesis(int n) {
3        List<String> result = new ArrayList<>();
4        StringBuilder curr = new StringBuilder();
5        backtrack( result, n, 0, 0, "");
6        return result;
7    }
8
9
10    private void backtrack( List<String> result, int n, int open, int close, String curr ){
11
12        if( curr.length() >= n*2 ){
13            result.add(curr);
14            return;
15        }
16        if( open < n ){
17            backtrack( result, n, open+1, close, curr+"(" );
18        }
19        if( close < open ){
20            backtrack( result, n, open, close+1, curr+")" );
21        }
22
23    }
24
25
26
27}