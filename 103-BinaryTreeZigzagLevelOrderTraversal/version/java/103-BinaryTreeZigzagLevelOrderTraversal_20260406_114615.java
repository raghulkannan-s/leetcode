// Last updated: 4/6/2026, 11:46:15 AM
1
2class Solution {
3    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
4        
5        List<List<Integer>> arr = new ArrayList<>();
6        boolean flip = true;
7        helper( root, 0, flip, arr );
8        return arr;
9
10    }
11
12    public void helper( TreeNode root, int level, boolean flip, List<List<Integer>> arr ){
13
14        if( root == null ) return;
15
16        if( arr.size() == level ){
17            arr.add( new ArrayList<>() );
18        }
19        if( flip ){
20            arr.get(level).add(root.val);
21        }else{
22            arr.get(level).add(0, root.val);
23        }
24        helper( root.left, level+1, !flip, arr);
25        helper( root.right, level+1, !flip, arr);
26        return;
27    }
28}