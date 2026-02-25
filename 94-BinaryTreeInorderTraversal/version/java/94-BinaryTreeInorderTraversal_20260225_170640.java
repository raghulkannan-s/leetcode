// Last updated: 2/25/2026, 5:06:40 PM
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
17    public List<Integer> inorderTraversal(TreeNode root) {
18        List<Integer> res = new ArrayList<>();
19        search( root, res );
20        return res;
21    }
22
23
24    private void search( TreeNode root, List<Integer> res ){
25
26        if( root == null ) return;
27
28        search( root.left, res );
29        res.add( root.val );
30        search( root.right, res );
31
32        return;
33
34    }
35
36
37
38
39}