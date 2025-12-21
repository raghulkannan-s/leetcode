// Last updated: 12/22/2025, 3:47:59 AM
1/**
2 * Definition for singly-linked list.
3 * class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }
11 */
12public class Solution {
13    public boolean hasCycle(ListNode head) {
14        
15        if ( head == null || head.next == null ) return false;
16
17        ListNode slow = head;
18        ListNode fast = head;
19
20        while ( fast != null && fast.next != null ){
21
22            slow = slow.next;
23            fast = fast.next.next;
24
25            if ( slow == fast ) return true;
26
27        }
28
29        return false;
30
31    }
32}