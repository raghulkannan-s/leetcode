// Last updated: 4/5/2026, 4:09:10 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17
18    int maxSum = Integer.MIN_VALUE;
19
20    public int maxPathSum(TreeNode root) {
21        dfs(root);
22        return maxSum;
23    }
24
25    private int dfs(TreeNode node) {
26        if (node == null) return 0;
27
28        int left = Math.max(0, dfs(node.left));  
29        int right = Math.max(0, dfs(node.right));
30
31        maxSum = Math.max(maxSum, left + right + node.val);
32
33        return node.val + Math.max(left, right);
34    }
35}