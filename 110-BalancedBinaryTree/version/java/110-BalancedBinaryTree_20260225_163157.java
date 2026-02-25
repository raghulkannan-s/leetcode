// Last updated: 2/25/2026, 4:31:57 PM
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
17    public boolean isBalanced(TreeNode root) {
18        
19        return height(root) != -1;
20
21    }
22
23    private int height ( TreeNode root ){
24
25        if( root == null ) return 0;
26
27        int left = height( root.left );
28        if( left == -1 ) return -1;
29        
30        int right = height( root.right );
31        if( right == -1 ) return -1;
32
33        if( Math.abs(left - right) > 1 ) return -1;
34
35
36        return 1 + Math.max( left, right );
37
38
39    }
40
41
42
43}