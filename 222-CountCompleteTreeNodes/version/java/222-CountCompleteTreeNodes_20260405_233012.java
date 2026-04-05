// Last updated: 4/5/2026, 11:30:12 PM
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
21
22        int left = countNodes( root.left );
23        int right = countNodes( root.right );
24
25        return 1+left+right;
26
27    }
28}