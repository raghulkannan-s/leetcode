// Last updated: 4/15/2026, 7:07:56 PM
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
21
22        if( root == null ){
23            return new TreeNode( val );
24        }
25
26        while( curr != null ){
27
28            if( val < curr.val ) {
29                prev = curr;
30                curr = curr.left;
31            }
32            else {
33                prev = curr;
34                curr = curr.right;
35            }
36        
37        }
38
39        if( val < prev.val ){
40            prev.left = new TreeNode( val );
41        }else{
42            prev.right = new TreeNode( val );
43        }
44
45        return root;
46
47    }
48}