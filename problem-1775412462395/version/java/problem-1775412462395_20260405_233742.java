// Last updated: 4/5/2026, 11:37:42 PM
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
18    public int countNodes(TreeNode root) {
19        
20        if( root == null ) return 0;
21        return 1+ countNodes( root.left ) + countNodes( root.right );
22
23    }
24}