// Last updated: 3/19/2026, 2:28:48 AM
1
2
3class Solution {
4    public List<String> generateParenthesis(int n) {
5        List<String> result = new ArrayList<>();
6        StringBuilder curr = new StringBuilder();
7        backtrack(result, n, 0, 0, curr);
8        return result;
9    }
10
11    private void backtrack(List<String> result, int n, int open, int close, StringBuilder curr) {
12
13        if (curr.length() == n * 2) {
14            result.add(curr.toString());
15            return;
16        }
17
18        if (open < n) {
19            curr.append('(');
20            backtrack(result, n, open + 1, close, curr);
21            curr.deleteCharAt(curr.length() - 1); 
22        }
23
24        if (close < open) {
25            curr.append(')');
26            backtrack(result, n, open, close + 1, curr);
27            curr.deleteCharAt(curr.length() - 1); 
28        }
29    }
30}