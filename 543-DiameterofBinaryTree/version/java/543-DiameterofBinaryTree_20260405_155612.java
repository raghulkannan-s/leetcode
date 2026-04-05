// Last updated: 4/5/2026, 3:56:12 PM
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
18    int res = 0;
19
20    public int findTilt(TreeNode root) {
21        
22        calc( root );
23        return res;
24
25    }
26
27    public int calc( TreeNode root ){
28
29        if( root == null ) return 0;
30
31        int left = calc( root.left );
32        int right = calc( root.right );
33
34        res += Math.abs( left - right );
35
36
37        return root.val + left + right;
38
39    }
40
41}