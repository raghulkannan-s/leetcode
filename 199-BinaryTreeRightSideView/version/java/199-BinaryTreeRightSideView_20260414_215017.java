// Last updated: 4/14/2026, 9:50:17 PM
1
2class Solution {
3    public List<Integer> rightSideView(TreeNode root) {
4        
5        List<Integer> res = new ArrayList<>();
6        Queue<TreeNode> q = new LinkedList<>();
7
8        if( root == null ) return res;
9
10        q.add( root );
11        while( !q.isEmpty() ){
12            int size = q.size();
13
14            for( int i = 0; i < size; i++ ){
15                TreeNode node = q.poll();
16
17                if( i == size-1 ){
18                    res.add(node.val);
19                }
20
21                if( node.left != null ) q.add( node.left );
22                if( node.right != null ) q.add( node.right );
23
24            }
25        }
26
27        return res;
28
29    }
30}