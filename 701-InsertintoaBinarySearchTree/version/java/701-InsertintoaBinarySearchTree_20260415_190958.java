// Last updated: 4/15/2026, 7:09:58 PM
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
17    public TreeNode insertIntoBST(TreeNode root, int val) {
18        
19        TreeNode curr = root;
20        TreeNode prev = root;
21        if( root == null ){
22            return new TreeNode( val );
23        }
24        while( curr != null ){
25            prev = curr;
26            if( val < curr.val ) curr = curr.left;
27            else curr = curr.right;
28        }
29
30        if( val < prev.val ) prev.left = new TreeNode( val );
31        else prev.right = new TreeNode( val );
32        
33        return root;
34
35    }
36}