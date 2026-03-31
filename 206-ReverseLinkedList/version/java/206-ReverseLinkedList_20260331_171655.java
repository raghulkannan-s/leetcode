// Last updated: 3/31/2026, 5:16:55 PM
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
14        ListNode newNode = null;
15        ListNode curr = head;
16
17        while( curr != null ){
18
19            ListNode temp = curr.next;
20            curr.next = newNode;
21            newNode = curr;
22            curr = temp;
23        }
24
25
26        return newNode;
27
28    }
29}