// Last updated: 4/5/2026, 11:02:06 PM
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
17    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
18        
19        List<List<Integer>> arr = new ArrayList<>();
20        System.out.println( arr.size() );
21        boolean flip = true;
22        helper( root, 0, flip, arr );
23        return arr;
24
25    }
26
27    public void helper( TreeNode root, int level, boolean flip, List<List<Integer>> arr ){
28
29        if( root == null ) return;
30
31        if( arr.size() == level ){
32            arr.add( new ArrayList<>() );
33        }
34
35        if( flip ){
36            arr.get(level).add(root.val);
37        }else{
38            arr.get(level).add(0, root.val);
39        }
40
41        helper( root.left, level+1, !flip, arr);
42        helper( root.right, level+1, !flip, arr);
43        return;
44    }
45}