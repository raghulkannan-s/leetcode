// Last updated: 4/14/2026, 11:58:59 PM
1class Solution {
2    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
3        
4        if (root == null || root == p || root == q) {
5            return root;
6        }
7
8        TreeNode left = lowestCommonAncestor(root.left, p, q);
9        TreeNode right = lowestCommonAncestor(root.right, p, q);
10
11        if (left != null && right != null) {
12            return root;
13        }
14
15        return (left != null) ? left : right;
16    }
17}