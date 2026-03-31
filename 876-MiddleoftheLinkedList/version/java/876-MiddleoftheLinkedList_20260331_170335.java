// Last updated: 3/31/2026, 5:03:35 PM
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
11 
12class Solution {
13    public ListNode middleNode(ListNode head) {
14        
15        ListNode slow = head;
16        ListNode fast = head;
17
18        while( fast != null && fast.next != null ){
19            fast = fast.next.next;
20            slow = slow.next;
21        }
22
23
24        return slow;
25
26    }
27}