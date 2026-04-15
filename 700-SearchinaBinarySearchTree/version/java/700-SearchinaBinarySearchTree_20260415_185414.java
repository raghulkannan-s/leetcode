// Last updated: 4/15/2026, 6:54:14 PM
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
17    public TreeNode searchBST(TreeNode root, int val) {
18        
19        while( root != null && root.val != val ){
20            if( val < root.val ) root = root.left;
21            else root = root.right;
22        }
23        return root;
24    }
25}