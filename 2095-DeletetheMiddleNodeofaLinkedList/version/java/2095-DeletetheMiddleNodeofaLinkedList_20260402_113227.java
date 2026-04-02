// Last updated: 4/2/2026, 11:32:27 AM
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
12    public ListNode deleteMiddle(ListNode head) {
13        
14        if (head == null || head.next == null) {
15            return null;
16        }
17
18        ListNode slow = head;
19        ListNode fast = head;
20        ListNode prev = null;
21
22        while( fast != null && fast.next != null){
23            prev = slow;
24            slow = slow.next;
25            fast = fast.next.next;
26        }
27
28        prev.next = slow.next;
29
30        return head;
31    
32    }
33}