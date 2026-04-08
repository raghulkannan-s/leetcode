// Last updated: 4/8/2026, 6:55:06 PM
1class Solution {
2    List<int[]> list = new ArrayList<>();
3    
4    public List<List<Integer>> verticalTraversal(TreeNode root) {
5        dfs(root, 0, 0);       
6        Collections.sort(list, (a, b) -> {
7            if (a[0] != b[0]) return a[0] - b[0];
8            if (a[1] != b[1]) return a[1] - b[1];
9            return a[2] - b[2];
10        });
11        List<List<Integer>> result = new ArrayList<>();
12        int prevCol = Integer.MIN_VALUE;
13
14        for (int[] node : list) {
15            int col = node[0], val = node[2];
16            if (col != prevCol) {
17                result.add(new ArrayList<>());
18                prevCol = col;
19            }
20            result.get(result.size() - 1).add(val);
21        }
22        return result;
23    }
24
25    private void dfs(TreeNode node, int row, int col) {
26        if (node == null) return;
27        list.add(new int[]{col, row, node.val});
28        dfs(node.left, row + 1, col - 1);
29        dfs(node.right, row + 1, col + 1);
30    }
31}