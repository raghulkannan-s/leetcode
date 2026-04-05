// Last updated: 4/5/2026, 10:31:37 PM
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
21        helper( root, 0, arr );
22        return arr;
23
24    }
25
26    public void helper( TreeNode root, int level, List<List<Integer>> arr ){
27
28        if( root == null ) return;
29
30        if( arr.size() == level ){
31            arr.add( new ArrayList<>() );
32        }
33
34        if( level % 2 == 0 ){
35            arr.get(level).add(root.val);
36        }else{
37            arr.get(level).add(0, root.val);
38        }
39
40        helper( root.left, level+1, arr);
41        helper( root.right, level+1, arr);
42        return;
43    }
44}