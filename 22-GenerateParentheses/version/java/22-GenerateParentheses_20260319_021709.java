// Last updated: 3/19/2026, 2:17:09 AM
1public class Solution {
2
3    public List<String> generateParenthesis(int n) {
4        List<String> result = new ArrayList<>();
5        backtrack(result, "", 0, 0, n);
6        return result;
7    }
8
9    private void backtrack(List<String> result, String current, int open, int close, int n) {
10        
11        if (current.length() == 2 * n) {
12            result.add(current);
13            return;
14        }
15
16        if (open < n) {
17            backtrack(result, current + "(", open + 1, close, n);
18        }
19
20        if (close < open) {
21            backtrack(result, current + ")", open, close + 1, n);
22        }
23    }
24}