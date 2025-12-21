// Last updated: 12/22/2025, 5:06:01 AM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public void reorderList(ListNode head) {
13
14        if ( head == null || head.next == null ) return;
15
16        ListNode fast = head;
17        ListNode slow = head;
18
19        while ( fast != null && fast.next != null ){
20            fast = fast.next.next;
21            slow = slow.next;
22        }
23
24        ListNode second = slow.next;
25        slow.next = null;
26
27        ListNode prev = null;
28        ListNode current = second;
29
30        while ( current != null ){
31            ListNode nextNode = current.next;
32            current.next = prev;
33            prev = current;
34            current = nextNode;
35        }
36
37        ListNode left = head;
38        ListNode right = prev;
39
40        while ( right != null ){
41
42            ListNode leftTemp = left.next;
43            ListNode rightTemp = right.next;
44
45            left.next = right;
46            right.next = leftTemp;
47
48            left = leftTemp;
49            right = rightTemp;
50
51        }
52
53
54    }   
55}