// Last updated: 4/6/2026, 12:02:18 AM
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
17    public boolean isSymmetric(TreeNode root) {
18        
19        return check( root.left, root.right );
20
21    }
22
23    public boolean check( TreeNode l, TreeNode r ){
24        if( l == null && r == null ) return true;
25        if( l == null || r == null ) return false;
26
27        if( r.val != l.val ) return false;
28
29        return check( l.left, r.right ) && check( l.right, r.left );
30    }
31}