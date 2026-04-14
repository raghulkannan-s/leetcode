// Last updated: 4/14/2026, 9:27:28 PM
1class Solution {
2    public List<List<Integer>> levelOrder(TreeNode root) {
3        
4        Queue<TreeNode> q = new LinkedList<>();
5        List<List<Integer>> res = new ArrayList<>();
6
7        if( root == null ) return res;
8        q.add(root);
9
10        while( !q.isEmpty() ){
11
12            int size = q.size();
13
14            List<Integer> temp = new ArrayList<>();
15            for( int i = 0; i < size; i++ ){
16
17                TreeNode node = q.poll();
18
19                temp.add(node.val);
20
21                if( node.left != null ) q.add( node.left );
22                if( node.right != null ) q.add( node.right );
23
24            }
25            res.add(temp);
26        }
27
28        return res;
29    }
30}