// Last updated: 4/6/2026, 12:15:06 AM
1
2class Solution {
3    public List<Integer> rightSideView(TreeNode root) {
4        List<Integer> res = new ArrayList<>();
5        helper( root, 0, res );
6        return res;
7    }
8
9    public void helper( TreeNode root, int level, List<Integer> res ){
10        if( root == null ) return;
11        
12        if( level == res.size() ){
13            res.add( root.val );
14        }
15
16        helper( root.right, level+1, res );
17        helper( root.left, level+1, res );
18
19        return;
20    }
21}