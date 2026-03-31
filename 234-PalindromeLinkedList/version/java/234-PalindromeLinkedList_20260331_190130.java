// Last updated: 3/31/2026, 7:01:30 PM
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
12    public boolean isPalindrome(ListNode head) {
13        
14        if (head == null || head.next == null) return true;
15
16        ListNode slow = head;
17        ListNode fast = head;
18
19        while (fast != null && fast.next != null) {
20            fast = fast.next.next;
21            slow = slow.next;
22        }
23
24        if (fast != null) {
25            slow = slow.next;
26        }
27
28        ListNode prev = null;
29        ListNode curr = slow;
30
31        while (curr != null) {
32            ListNode temp = curr.next;
33            curr.next = prev;
34            prev = curr;
35            curr = temp;
36        }
37
38        ListNode left = head;
39        ListNode right = prev;
40
41        while (right != null) {
42            if (left.val != right.val) return false;
43            left = left.next;
44            right = right.next;
45        }
46
47        return true;
48    }
49}