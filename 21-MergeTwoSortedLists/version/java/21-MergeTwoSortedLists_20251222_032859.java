// Last updated: 12/22/2025, 3:28:59 AM
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
12    public ListNode reverseList(ListNode head) {
13        
14        ListNode prev = null;
15        ListNode curr = head;
16
17        while( curr != null){
18
19            ListNode nextNode = curr.next;
20            curr.next = prev;
21            prev = curr;
22            curr = nextNode;
23
24        }
25
26        return prev;
27
28
29
30    }
31}