// Last updated: 4/16/2026, 7:13:50 PM
1class Solution {
2    public TreeNode deleteNode(TreeNode root, int key) {
3
4        if (root == null) return null;
5
6        TreeNode nodeToDelete = root;
7        TreeNode parent = null;
8
9        while (nodeToDelete != null && nodeToDelete.val != key) {
10            parent = nodeToDelete;
11            if (key < nodeToDelete.val) nodeToDelete = nodeToDelete.left;
12            else nodeToDelete = nodeToDelete.right;
13        }
14
15        if (nodeToDelete == null) return root;
16
17        if (nodeToDelete.left == null || nodeToDelete.right == null) {
18
19            TreeNode child = (nodeToDelete.left != null)
20                                ? nodeToDelete.left
21                                : nodeToDelete.right;
22           
23            if (nodeToDelete == root) return child;
24
25            if (parent.left == nodeToDelete) parent.left = child;
26            else parent.right = child;
27
28            return root;
29        }
30
31        // Step 1: find successor (smallest in right subtree)
32        TreeNode successorParent = nodeToDelete;
33        TreeNode successor = nodeToDelete.right;
34
35        while (successor.left != null) {
36            successorParent = successor;
37            successor = successor.left;
38        }
39
40        // Step 2: copy successor value
41        nodeToDelete.val = successor.val;
42
43        // Step 3: delete successor
44        if (successorParent.left == successor)
45            successorParent.left = successor.right;
46        else
47            successorParent.right = successor.right;
48
49        return root;
50    }
51}