// Last updated: 4/2/2026, 11:19:04 AM
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
12    public ListNode removeNthFromEnd(ListNode head, int n) {
13        
14        ListNode dummy = new ListNode(0, head);
15
16        ListNode slow = dummy;
17        ListNode fast = dummy;
18
19        while( n-- >= 0 ){
20            fast = fast.next;
21        }
22
23        while( fast != null ){
24            slow = slow.next;
25            fast = fast.next;
26        }
27
28        slow.next = slow.next.next;
29
30        return dummy.next;
31    }
32}