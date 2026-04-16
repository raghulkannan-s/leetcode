// Last updated: 4/16/2026, 4:34:16 PM
1
2class Solution {
3    public boolean isValidBST(TreeNode root) {
4        return helper( root, Long.MIN_VALUE, Long.MAX_VALUE );
5    }
6
7    public boolean helper( TreeNode node, long min, long max ){
8
9        if( node == null ) return true;
10
11        if (node.val <= min || node.val >= max) return false;
12        return helper(node.left, min, node.val) && helper(node.right, node.val, max);
13
14    }
15}