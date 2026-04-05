// Last updated: 4/5/2026, 4:20:40 PM
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
18    int res = Integer.MIN_VALUE;
19    
20    public int maxPathSum(TreeNode root) {
21        
22        calc( root );
23
24        return res;
25
26    }
27
28    public int calc( TreeNode root ){
29        
30        if( root == null ) return 0;
31
32        int left = Math.max(0, calc(root.left));
33        int right = Math.max(0, calc(root.right));
34
35        res = Math.max( res, left + right + root.val );
36
37        return root.val + Math.max( left, right );
38        
39
40    }
41}