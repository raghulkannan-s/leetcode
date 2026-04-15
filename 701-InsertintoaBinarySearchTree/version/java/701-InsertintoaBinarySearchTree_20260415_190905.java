// Last updated: 4/15/2026, 7:09:05 PM
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
26            if( val < curr.val ) {
27                curr = curr.left;
28            }
29            else {
30                curr = curr.right;
31            }
32        }
33
34        if( val < prev.val ){
35            prev.left = new TreeNode( val );
36        }else{
37            prev.right = new TreeNode( val );
38        }
39        return root;
40
41    }
42}