// Last updated: 4/16/2026, 5:11:27 PM
1
2class Solution {
3    public boolean isValidBST(TreeNode root) {
4        return helper( root, Long.MIN_VALUE, Long.MAX_VALUE );
5    }
6
7    public boolean helper( TreeNode root, long min, long max ){
8
9        if( root == null ) return true;
10
11        if (root.val <= min || root.val >= max) return false;
12        
13        return helper(root.left, min, root.val) && helper(root.right, root.val, max);
14
15    }
16}