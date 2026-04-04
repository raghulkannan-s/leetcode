// Last updated: 4/4/2026, 3:56:59 PM
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
17    public List<List<Integer>> levelOrder(TreeNode root) {
18        
19        List<List<Integer>> res = new ArrayList<>();
20
21        search(root, 0, res);
22        
23        return res;
24
25    }
26
27    public void search( TreeNode root, int level, List<List<Integer>> res ){
28
29        if( root == null ) return;
30
31        if( level == res.size() ){
32            res.add( new ArrayList<>() );
33        }
34
35        res.get(level).add(root.val);
36
37        search( root.left, level+1, res );
38        search( root.right, level+1, res );
39
40        return;
41
42    }
43
44
45}