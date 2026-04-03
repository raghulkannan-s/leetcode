// Last updated: 4/3/2026, 6:34:44 PM
1/*
2// Definition for a Node.
3class Node {
4    int val;
5    Node next;
6    Node random;
7
8    public Node(int val) {
9        this.val = val;
10        this.next = null;
11        this.random = null;
12    }
13}
14*/
15
16class Solution {
17    public Node copyRandomList(Node head) {
18         
19        if( head == null ) return head;
20
21        Node curr = head;
22
23        while( curr != null ){
24            Node newNode  = new Node(curr.val);
25            newNode.next = curr.next;
26            curr.next = newNode;
27            curr = newNode.next;
28        }
29
30        curr = head;
31        while (curr != null) {
32            if (curr.random != null) {
33                curr.next.random = curr.random.next;
34            }
35            curr = curr.next.next;
36        }
37
38
39        curr = head;
40        Node copy = head.next;
41
42        Node newHead = new Node(-1);
43        newHead.next = copy;
44
45        while( curr != null && copy != null ){
46
47            curr.next = curr.next.next;
48
49            if (copy.next != null) {
50                copy.next = copy.next.next;
51            }
52
53            curr = curr.next;
54            copy = copy.next;
55        }
56
57        return newHead.next;
58
59    }   
60}