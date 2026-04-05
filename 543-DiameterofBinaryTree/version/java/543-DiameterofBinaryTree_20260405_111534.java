// Last updated: 4/5/2026, 11:15:34 AM
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
18    int diameter = 0;
19
20    public int calc(TreeNode root) {
21        
22        if( root == null ) return 0;
23
24        int left = calc( root.left );
25        int right = calc( root.right );
26
27        diameter = Math.max( diameter, left + right );
28
29        return 1 + Math.max(left, right);
30
31    }
32    
33    public int diameterOfBinaryTree( TreeNode root ){
34
35        calc( root );
36        return diameter;
37    }
38}