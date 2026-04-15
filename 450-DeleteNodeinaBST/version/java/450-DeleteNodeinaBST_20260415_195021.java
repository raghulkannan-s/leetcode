// Last updated: 4/15/2026, 7:50:21 PM
1
2class Solution {
3    public TreeNode deleteNode(TreeNode root, int key) {
4
5        TreeNode curr = root;
6        TreeNode prev = root;
7
8        if( root == null ) return null;
9
10        while( curr != null && curr.val != key ){
11            prev = curr;
12            if( key < curr.val ) curr = curr.left;
13            else curr = curr.right;
14        }
15
16        if( curr == null ) return root;
17
18        if (curr.left == null || curr.right == null) {
19            TreeNode child = (curr.left != null) ? curr.left : curr.right;
20
21            if (curr == root) return child;
22
23            if (prev.left == curr) prev.left = child;
24            else prev.right = child;
25
26            return root;
27        }
28
29        TreeNode temp = curr.right;
30        TreeNode tPrev = curr;
31
32        while( temp.left != null ){
33            tPrev = temp;
34            temp = temp.left;
35        }
36        
37        curr.val = temp.val;
38
39        if (tPrev.left == temp) tPrev.left = temp.right;
40        else tPrev.right = temp.right;
41
42        return root;
43
44
45    }
46}