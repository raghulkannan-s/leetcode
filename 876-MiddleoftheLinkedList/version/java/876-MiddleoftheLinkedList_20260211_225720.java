// Last updated: 2/11/2026, 10:57:20 PM
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
12    public ListNode middleNode(ListNode head) {
13        
14        ListNode fast = head;
15        ListNode slow = head;
16        
17        while( fast != null && fast.next != null){
18
19            slow = slow.next;
20            fast = fast.next.next;
21
22        }
23
24        return slow;
25
26    }
27}