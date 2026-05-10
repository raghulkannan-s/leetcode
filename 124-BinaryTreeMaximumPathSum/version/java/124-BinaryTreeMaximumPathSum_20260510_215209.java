// Last updated: 5/10/2026, 9:52:09 PM
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
17    int res = Integer.MIN_VALUE;
18    public int maxPathSum(TreeNode root) {
19        dfs(root);
20        return res;
21    }
22
23    public int dfs( TreeNode root ){
24
25        if( root == null ) return 0;
26
27        int left = Math.max( 0, dfs(root.left) );
28        int right = Math.max( 0, dfs(root.right) );
29
30        res = Math.max( res, root.val + left + right );
31
32        return root.val + Math.max( left, right );
33
34    }
35
36
37
38}